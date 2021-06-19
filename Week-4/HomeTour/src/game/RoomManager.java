package game;

import java.util.ArrayList;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	//the room a player should start in.
//	Room[] rooms = new Room[10];
	ArrayList<Room> rooms = new ArrayList<Room>();
	//all the rooms in the house.
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house.\nA dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
		rooms.add(foyer);
		setStartingRoom(foyer);	
		
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room room) {
		this.startingRoom = room;
	}
	public ArrayList<Room> foyerExits() {
		ArrayList<Room> exitsToFoyer = new ArrayList<Room>();
		Room dinning= new Room(
				"Dinning Room",
				"A place to eat",
				"This dining room is really dusty."
				+"There are no other exits besideds the one behind me."
				+"All of the cutlery and plates have been set they look dirty but freshly placed down.");
		exitsToFoyer.add(dinning);
		Room upStairs= new Room(
				"Stairs",
				"A walkway up",
				"The upstairs walkway is completly blocked off."
				+"It is blocked by other furniture and other things");
		exitsToFoyer.add(upStairs);
		Room piano= new Room(
				"Piano Room",
				"Short description",
				"Long Description");
		exitsToFoyer.add(piano);
		Room doorway= new Room(
				"Doorway",
				"Short description",
				"Long Description");
		exitsToFoyer.add(doorway);
		return exitsToFoyer;
	}
	
}
