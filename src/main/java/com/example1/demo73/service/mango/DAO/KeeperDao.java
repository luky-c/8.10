package com.example1.demo73.service.mango.DAO;

import model.ElevatorKeeper;

public interface KeeperDao {
	public void addKeeper(ElevatorKeeper keeper);
	public void changeKeeper(ElevatorKeeper keeper);
	public void deleteKeeper(String id);
	public ElevatorKeeper checkKeeper(String id);
}
