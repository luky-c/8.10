package com.example1.demo73.service.controller;

import com.example1.demo73.service.UploadService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import model.response.UploadFileResponse;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;

/**
 * 上传文件专用接口
 */
@RestController
@RequestMapping(value = "/upload")
@Slf4j
public class UploadController {
    @Resource
    private UploadService uploadService;

    @RequestMapping(value = "/uploadPic" ,method = RequestMethod.POST)
    public UploadFileResponse uploadPic(@RequestParam(value = "file") MultipartFile[] files, @RequestParam(value = "ids") List<String> fileIds) {
        UploadFileResponse uploadFileResponse = new UploadFileResponse();
        if(!CollectionUtils.isEmpty(fileIds) && files.length != fileIds.size()) {
            uploadFileResponse.setCode(100);
            return uploadFileResponse;
        }
        List<String> ids = Lists.newArrayListWithCapacity(files.length);
        if( files.length > 0 ){
            if( CollectionUtils.isEmpty(fileIds)) {
                //循环获取file数组中得文件
                for (int i = 0; i < files.length; i++) {
                    MultipartFile file = files[i];
                    //保存文件
                    ids.add(uploadService.saveFile(files[i]));

                }
            }else {
                for (int i = 0; i < files.length; i++) {
                    MultipartFile file = files[i];
                    //保存文件
                    ids.add(uploadService.updateFile(files[i], fileIds.get(i)));

                }
            }
        }
        uploadFileResponse.setCode(200);
        uploadFileResponse.setFileId(ids);
        return uploadFileResponse;
    }

    @RequestMapping(value = "/getPic" ,method = RequestMethod.GET)
    public void getPic(@RequestParam String id, HttpServletResponse response) {
        byte[] bytes = uploadService.getFileById(id);
        response.setContentType("image/jpeg");
        try(OutputStream os = response.getOutputStream()) {
            os.write(bytes);
            os.flush();
            os.close();
        }catch (Exception e) {
            log.error("获取文件出错 ", e);
        }

    }
}
