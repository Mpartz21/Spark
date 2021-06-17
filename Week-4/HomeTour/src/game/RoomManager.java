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
			"The small entryway of a neo-colonial house.\n A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.",
			4);
		this.rooms[0] = foyer;
		setStartingRoom(foyer);	
		
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room room) {
		this.startingRoom = room;
	}
	public Room[] foyerExits() {
		Room[] exitsToFoyer = new Room[4];
		Room dinning= new Room(
				"Dinning Room",
				"A place to eat",
				"This dining room is really dusty."
				+"There are no other exits besideds the one behind me."
				+"All of the cutlery and plates have been set they look dirty but freshly placed down.",
				0);
		exitsToFoyer[2]= dinning;
		Room upStairs= new Room(
				"Stairs",
				"A walkway up",
				"The upstairs walkway is completly blocked off."
				+"It is blocked by other furniture and other things",
				0);
		exitsToFoyer[1]= upStairs;
		Room piano= new Room(
				"Piano Room",
				"Short description",
				"Long Description",
				0);
		exitsToFoyer[0]= piano;
		Room doorway= new Room(
				"Doorway",
				"Short description",
				"Long Description",
				0);
		exitsToFoyer[3]= doorway;
		return exitsToFoyer;
	}
	
}
