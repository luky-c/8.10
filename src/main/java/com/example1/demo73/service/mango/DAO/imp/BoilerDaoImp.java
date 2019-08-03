package com.example1.demo73.service.mango.DAO.imp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.example1.demo73.service.mango.DAO.BoilerDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import model.Boiler;

@Component
public class BoilerDaoImp implements BoilerDao{
		@Autowired
		private MongoTemplate mongoTemplate;
		
		@Override
		public void addNewBoiler(Boiler boiler,String id ){
			boiler.setId(id);
			mongoTemplate.insert(boiler, "BoilerCollection");			
		}
		public void changeBoiler(Boiler boiler){
			Query query = Query.query(Criteria.where("_id").is(boiler.getId()));
			DBObject dbDoc = new BasicDBObject();
			mongoTemplate.getConverter().write(boiler, dbDoc); 
			Update update = Update.fromDBObject(dbDoc);
			mongoTemplate.upsert(query, update, "BoilerCollection");						
		}
		@Override
		public Boiler checkBoiler(String id){
			
		//	Query query = Query.query(Criteria.where("_id").is(id));
			
			
			Boiler boiler =  mongoTemplate.findById(id, Boiler.class, "BoilerCollection");
			

			return boiler;
		}
		@Override
		public void deleteBoiler(String id){
		
			Query query = Query.query(Criteria.where("_id").is(id));
			mongoTemplate.remove(query, Boiler.class, "BoilerCollection");
		}
		
		public List<String> checkID(String Corpnname){
			List<String> list = new ArrayList<String>();
			
			
			Query query = new Query();
			Criteria criteria = Criteria.where("corpnName").is(Corpnname); 
			 query.addCriteria(criteria);
			List<Boiler> Blist = mongoTemplate.find(query, Boiler.class,"BoilerCollection");
			
			for(Boiler boiler : Blist){
				
				if(boiler != null){
				list.add(boiler.getId());
				}
				
			}
			return list;
		}
		
		public Set<String> checkName(){
			Set<String> nameSet = new HashSet<String>();
			List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
			for(Boiler boiler : Blist){
				if(boiler != null){
				System.out.print(boiler.getCorpnName());
				nameSet.add(boiler.getCorpnName());
				}
			}
			return nameSet;
		}
}
