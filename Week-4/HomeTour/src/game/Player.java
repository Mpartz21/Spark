package game;

import fixtures.Room;

public class Player {
	private String playerName;

	private Room currentRoom ;
	//current room
	public Player(String playerNames){
		this.playerName = playerNames;
	}
	public String getCurrentRoomName(){
		return this.currentRoom.getName();
	}
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
