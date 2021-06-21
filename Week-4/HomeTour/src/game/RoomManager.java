package game;

import java.util.ArrayList;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	//the room a player should start in.
//	Room[] rooms = new Room[10];
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room room) {
		this.startingRoom = room;
	}
	
	
	
	//all the rooms in the house.
	public void init() {
	    Room foyer = new Room(
			"Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house.\nA dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
		rooms.add(foyer);
		setStartingRoom(foyer);	
		Room dinning= new Room(
				"Dinning Room",
				"Short description",
				"Long Description");
		rooms.add(dinning);
		Room upStairs= new Room(
				"Stairs",
				"Short description",
				"Long Description");
		rooms.add(upStairs);
		Room piano= new Room(
				"Piano Room",
				"Short description",
				"Long Description");
		rooms.add(piano);
		Room library= new Room(
				"library",
				"Short description",
				"Long Description");
		rooms.add(library);
		foyer.setExits("north", piano);
		foyer.setExits("west", library);
		foyer.setExits("south", dinning);
		piano.setExits("south", foyer);
		library.setExits("east", foyer);
		dinning.setExits("north", foyer);
	}
	
}
