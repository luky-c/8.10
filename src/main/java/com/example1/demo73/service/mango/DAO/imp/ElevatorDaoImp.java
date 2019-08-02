package com.example1.demo73.service.mango.DAO.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.example1.demo73.service.mango.DAO.ElevatorDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import model.Boiler;
import model.Crane;
import model.Elevator;
@Component
public class ElevatorDaoImp implements ElevatorDao{
		@Autowired
		private MongoTemplate mongoTemplate;
		
		@Override
		public void addNewElevator(Elevator Elevator,long id){
			Elevator.setId(id);
			mongoTemplate.insert(Elevator, "ElevatorCollection");			
		}
		public void changeElevator(Elevator Elevator){
			Query query = Query.query(Criteria.where("_id").is(Elevator.getId()));
			DBObject dbDoc = new BasicDBObject();
			mongoTemplate.getConverter().write(Elevator, dbDoc); 
			Update update = Update.fromDBObject(dbDoc);
			mongoTemplate.upsert(query, update, "ElevatorCollection");						
		}
		@Override
		public Elevator checkElevator(long id){
		//	Query query = Query.query(Criteria.where("id").is(id));
			Elevator Elevator =  mongoTemplate.findById(id, Elevator.class, "ElevatorCollection");
			return Elevator;
		}
		@Override
		public void deleteElevator(long id){
			Query query = Query.query(Criteria.where("_id").is(id));
			mongoTemplate.remove(query, Elevator.class, "ElevatorCollection");
		}
		
		public List<Long> checkID(String corpnName){
			List<Long> list = new ArrayList<Long>();
			Query query = Query.query(Criteria.where("corpnName").is(corpnName));
			List<Elevator> Elist = mongoTemplate.find(query, Elevator.class,"ElevatorCollection");
			for(Elevator elevator : Elist){
				list.add(elevator.getId());
			}
			return list;
		}
		public Set<String> checkName(){
			Set<String> nameSet = new HashSet<String>();
			List<Elevator> Blist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
			for(Elevator boiler : Blist){
				if(boiler != null){
				nameSet.add(boiler.getCorpnName());
				}
			}
			return nameSet;
		}
		
}
