package game;

import java.util.Scanner;

import fixtures.Room;
import game.RoomManager;

public class Main {

	public static void main(String Args[]) {
		System.out.println("Please type in lower case only.");
		RoomManager roomManager = new RoomManager();
		Scanner scanner = new Scanner(System.in);
		
		roomManager.init();
		System.out.println(roomManager.getStartingRoom().getName());
			
		System.out.println("What's your name?");
		
		String command = scanner.next();
		
		Player player = new Player(command);
	
		
		player.setCurrentRoom(roomManager.getStartingRoom());
	System.out.println(player.getCurrentRoomName());
		
		System.out.println("You wake up.\n"+
				"You hear a voice.\n"+
				"'HEY "+ player.getPlayerName().toUpperCase() +"?\nFOLLOW MY VOICE!'\n");
		
		
		
		while(command != "quit") {
			printRoom(player);
			break;
		}
		
	}
	public static void printRoom(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside "+ player.getCurrentRoomName());
	}
	
	public static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		String[] inputCommands= scanner.next().split(" ");
		return inputCommands;
	}
	
	public static void parse(String[] inputCommands,Player player) {
		String action = inputCommands[0];
		String location = inputCommands[1];
	switch(action) {
	
		case ("go") :
//			player.setCurrentRoom(location);
			break;
		default:
			System.out.println("What was that? Try again.");
			break;
		}	
	}	
}

