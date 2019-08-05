package com.example1.demo73.service.mango.DAO.imp;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import lombok.extern.slf4j.Slf4j;
import model.SaveFileModel;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Service
@Component
@Slf4j
public class SaveFileDaoImpl {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertData(SaveFileModel saveFileModel) {
        mongoTemplate.insert(saveFileModel, "SaveFileCollection");
    }

    public void updateDataById(SaveFileModel saveFileModel) {
        Query query = Query.query(Criteria.where("_id").is(saveFileModel.getId()));
        DBObject dbDoc = new BasicDBObject();
        mongoTemplate.getConverter().write(saveFileModel, dbDoc);
        Update update = Update.fromDBObject(dbDoc);
        mongoTemplate.updateFirst(query, update, SaveFileModel.class);
    }

    public SaveFileModel findById(String id) {
        List<SaveFileModel> saveFileModels = mongoTemplate.find(Query.query(Criteria.where("_id").is(id)), SaveFileModel.class, "SaveFileCollection");
        if(saveFileModels.size() > 1) {
            log.error("上传文件SaveFIleModel 具有重复id，请注意...");
        }
        return CollectionUtils.isEmpty(saveFileModels) ? null : saveFileModels.get(0);
    }

    public SaveFileModel deleteById(String id) {
        Query query = Query.query(Criteria.where("_id").is(id));
        return mongoTemplate.findAndRemove(query, SaveFileModel.class);
    }

}
