package com.example1.demo73.service.mango.DAO;

import model.Crane;

public interface CraneDao {
	public void addNewCrane(Crane crane,long id);
	public void changeCrane (Crane crane);
	public void deleteCrane(long id);
	public Crane checkCrane(long id);
}
