package game;

import java.util.Scanner;

import fixtures.Room;

public class Player {
	private String playerName;

	private Room currentRoom;
	//current room
	
	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	
	public void setCurrentRoom(Room room) {
		this.currentRoom = room;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public void setPlayerName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String playersName = scanner.next();
		this.playerName = playersName;		
	}
	
}
