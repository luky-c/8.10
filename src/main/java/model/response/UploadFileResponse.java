package model.response;

import lombok.Data;

import java.util.List;

@Data
public class UploadFileResponse {

    private int code;

    private List<String> fileId;
}
