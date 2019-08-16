package com.example1.demo73.service.mango.DAO.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.example1.demo73.service.mango.DAO.KeeperDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import model.ElevatorKeeper;

@Component
public class KeeperDaoImp implements KeeperDao {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void addKeeper(ElevatorKeeper keeper){
		mongoTemplate.insert(keeper, "KeeperCollection");
	}
	public void changeKeeper(ElevatorKeeper keeper){
		Query query = Query.query(Criteria.where("_id").is(keeper.getId()));
		DBObject dbDoc = new BasicDBObject();
		mongoTemplate.getConverter().write(keeper, dbDoc); 
		Update update = Update.fromDBObject(dbDoc);
		mongoTemplate.upsert(query, update, ElevatorKeeper.class, "KeeperCollection");
	}
	public void deleteKeeper(String id){
		Query query = Query.query(Criteria.where("_id").is(id));
		mongoTemplate.remove(query, ElevatorKeeper.class, "KeeperCollection");
	}
	public ElevatorKeeper checkKeeper(String id){
		return mongoTemplate.findById(id, ElevatorKeeper.class, "KeeperCollection");
	}

}
