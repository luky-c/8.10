package com.example1.demo73.service.mango.DAO;

import model.Boiler;

public interface BoilerDao {
	public void addNewBoiler(Boiler boiler,String id);
	public void changeBoiler (Boiler boiler);
	public void deleteBoiler(String id);
	public Boiler checkBoiler(String id);
	
}
