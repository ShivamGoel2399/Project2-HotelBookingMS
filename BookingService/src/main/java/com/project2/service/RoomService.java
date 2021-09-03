package com.project2.service;

import java.util.List;

import com.project2.model.Hotel;
import com.project2.model.Room;

public interface RoomService {

	List<Room> findAll();

	void createRoom(Room room);

	void deleteRoom(Long roomId);

	
	void updateRoom(Room room);
	
//	List<Hotel> findAll1();
}
