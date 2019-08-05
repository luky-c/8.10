package com.example1.demo73.service;

import com.example1.demo73.service.mango.DAO.imp.SaveFileDaoImpl;
import lombok.extern.slf4j.Slf4j;
import model.SaveFileModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
@Slf4j
public class UploadService {

    @Value("${filePath}")
    private String filePath;

    @Autowired
    private SaveFileDaoImpl saveFileDaoImpl;

    public String saveFile(MultipartFile file) {
        if (!file.isEmpty()){
            try {
                //为防止重名，加入五位随机数
                String fileName = filePath + RandomStringUtils.randomAlphanumeric(5) + "_" + file.getOriginalFilename();
                byte[] bytes = file.getBytes();
                Path path = Paths.get(fileName);
                Files.write(path, bytes);
                SaveFileModel saveFileModel = new SaveFileModel();
                saveFileModel.setFilePath(fileName);
                saveFileDaoImpl.insertData(saveFileModel);
                return saveFileModel.getId();
            } catch (IOException e) {
                log.error("文件保存出错 ", e);
            }
        }
        return "-1";
    }


    public byte[] getFileById(String id) {
        SaveFileModel saveFileModel = saveFileDaoImpl.findById(id);
        if(saveFileModel == null || StringUtils.isEmpty(saveFileModel.getFilePath())) {
            return null;
        }
        File file = new File(saveFileModel.getFilePath());
        if(!file.exists()) {
            return null;
        }
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] data = new byte[fileInputStream.available()];
            fileInputStream.read(data) ;
            return data;
        }catch (Exception e) {
            log.error("读取文件出错 文件id:{}", id,  e);
        }
        return null;
    }

    public boolean deletePic(String id) {
        try {
            //mongo中删除
            SaveFileModel saveFileModel = saveFileDaoImpl.deleteById(id);
            //文件中删除
            FileUtil.deleteContents(new File(saveFileModel.getFilePath()));
            return true;
        }catch (Exception e) {
            log.error("删除文件失败 ", e);
        }
        return false;
    }
}
