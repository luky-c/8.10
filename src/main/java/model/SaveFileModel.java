package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "SaveFileCollection")
public class SaveFileModel {
    @Id
    private String id;

    //表单是否提交字段， true or false
    private String submitted;

    //文件路径
    private String filePath;

}
