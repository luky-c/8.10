package com.example1.demo73.service.mango.DAO;

import model.Elevator;

public interface ElevatorDao {
	public void addNewElevator(Elevator crane,long id);
	public void changeElevator (Elevator crane);
	public void deleteElevator(long id);
	public Elevator checkElevator(long id);
}
