package com.example1.demo73.service.mango.DAO;

import model.Crane;

public interface CraneDao {
	public void addNewCrane(Crane crane,String id);
	public void changeCrane (Crane crane);
	public void deleteCrane(String id);
	public Crane checkCrane(String id);
}
