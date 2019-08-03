package com.example1.demo73.service.mango.DAO;

import model.Elevator;

public interface ElevatorDao {
	public void addNewElevator(Elevator crane,String id);
	public void changeElevator (Elevator crane);
	public void deleteElevator(String id);
	public Elevator checkElevator(String id);
}
