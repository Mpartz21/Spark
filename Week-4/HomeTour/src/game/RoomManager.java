package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	//the room a player should start in.
	Room[] rooms = new Room[10];
	//all the rooms in the house.
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
			this.rooms[0] = foyer;
			this.setStartingRoom(foyer);
			System.out.println(getStartingRoom().getName());

	        
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room room) {
		this.startingRoom = room;
	}
	
}
