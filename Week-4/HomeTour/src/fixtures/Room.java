package fixtures;

public class Room extends fixtures.Fixture {
	Room[] exits;
	
	public Room(String name,String shortDescription,String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[1]; // size is your choice
		
	}

	public Room[] getExits() {
		return this.exits;
	}
		
	public Room getExit(String direction) {
		for(Room room : exits) {
			if(direction == "North") {
				return room;
			}
		}
		return null;
	}
}
 