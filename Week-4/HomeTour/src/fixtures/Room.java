package fixtures;

public class Room extends fixtures.Fixture {
	private Room[] exits;
	
	public Room(String name,String shortDescription,String longDescription,int exits) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[exits]; // size is your choice
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	public Room[] getExits() {
		return this.exits;
	}
		
	public Room getExit(String direction) {
		switch(direction.toLowerCase()) {
		case "north":
			return this.exits[0];
		case "east":
			return this.exits[1];
		case "south":
			return this.exits[2];
		case "west":
			return this.exits[3];
		default:
			System.out.println("What was that? Try again.");
			return null;

		}
	}
}
 