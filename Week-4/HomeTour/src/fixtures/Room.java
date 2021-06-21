package fixtures;

import java.util.HashMap;
import java.util.Map;

public class Room extends fixtures.Fixture {
	private Map<String,Room> exits = new HashMap<>();
	
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
		for(String keyDirection : exits.keySet()) {
			if(keyDirection.startsWith(direction.toLowerCase().intern())) {
				return exits.get(keyDirection);	
			}
		}
		return null;
	}
}
 