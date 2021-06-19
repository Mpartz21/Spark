package fixtures;

import java.util.Map;

public class Room extends fixtures.Fixture {
	private Map<String,Room> exits;
	
	public Room(String name,String shortDescription,String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public void setExits(String direction,Room room) {
		exits.put(direction, room);
	}

	public Map<String, Room> getExits() {
		return this.exits;
	}
		
	public Room getExit(String direction) {
		switch(direction.toLowerCase()) {
		case "north":
			return exits.get(direction);
		case "east":
			return exits.get(direction);
		case "south":
			return exits.get(direction);
		case "west":
			return exits.get(direction);
		default:
			System.out.println("What was that? Try again.");
			return null;

		}
	}
}
 