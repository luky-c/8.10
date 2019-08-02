package com.example1.demo73.service.mango.DAO;

import model.Boiler;

public interface BoilerDao {
	public void addNewBoiler(Boiler boiler,Long id);
	public void changeBoiler (Boiler boiler);
	public void deleteBoiler(long id);
	public Boiler checkBoiler(long id);
	
}
