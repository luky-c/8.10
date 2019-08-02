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

import com.example1.demo73.service.mango.DAO.CraneDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import model.Boiler;
import model.Crane;
@Component
public class CraneDaoImp implements CraneDao{
		@Autowired
		private MongoTemplate mongoTemplate;
		
		@Override
		public void addNewCrane(Crane Crane,long id){
			Crane.setId(id);
			mongoTemplate.insert(Crane, "CraneCollection");			
		}
		public void changeCrane(Crane Crane){
			Query query = Query.query(Criteria.where("_id").is(Crane.getId()));
			DBObject dbDoc = new BasicDBObject();
			mongoTemplate.getConverter().write(Crane, dbDoc); 
			Update update = Update.fromDBObject(dbDoc);
			mongoTemplate.upsert(query, update, "CraneCollection");						
		}
		@Override
		public Crane checkCrane(long id){
		//	Query query = Query.query(Criteria.where("id").is(id));
			Crane Crane =  mongoTemplate.findById(id, Crane.class, "CraneCollection");
			return Crane;
		}
		@Override
		public void deleteCrane(long id){
			Query query = Query.query(Criteria.where("_id").is(id));
			mongoTemplate.remove(query, Crane.class, "CraneCollection");
		}
		public List<Long> checkID(String corpnName){
			List<Long> list = new ArrayList<Long>();
			Query query = Query.query(Criteria.where("corpnName").is(corpnName));
			List<Crane> Clist = mongoTemplate.find(query, Crane.class,"CraneCollection");
			for(Crane crane : Clist){
				list.add(crane.getId());
			}
			return list;
		}
		
		public Set<String> checkName(){
			Set<String> nameSet = new HashSet<String>();
			List<Crane> Blist = mongoTemplate.findAll(Crane.class, "CraneCollection");
			for(Crane boiler : Blist){
				if(boiler != null){
				nameSet.add(boiler.getCorpnName());
				}
			}
			return nameSet;
		}
		
}
