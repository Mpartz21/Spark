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
		
//		player.getCurrentRoom().setExits("start",roomManager.getStartingRoom());
		
		System.out.println(player.getCurrentRoomName());
		
		System.out.println("You wake up.\n"+
				"You hear a voice.\n"+
				"'HEY "+ player.getPlayerName().toUpperCase() +"?\nFOLLOW MY VOICE!'\n");
		
		while(command != "quit") {
			System.out.println("type 'quit' anytime to quit");
			printRoom(player);
			printShortDescription(player);
			printLongDescription(player);
			String[] inputCommands = collectInput();
			parse(inputCommands,player);
//			for(Room room : player.getCurrentRoom().getExits()) {
//				System.out.println(room.getName());
//			}
			break;
		}
		scanner.close();
	}
	
	public static void printRoom(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside "+ player.getCurrentRoomName());
	}
	
	public static void printShortDescription(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside "+ player.getCurrentRoom().getShortDescription());
	}
	
	public static void printLongDescription(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside "+ player.getCurrentRoom().getLongDescription());
	}
	
	public static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		String[] inputCommands= scanner.next().split(" ");
		scanner.close();
		return inputCommands;
	}
	
	public static void parse(String[] inputCommands,Player player) {
		String action = inputCommands[0];
		String direction = inputCommands[1];
	switch(action) {
	
		case ("go") :
			System.out.println("Going ");
			switch(direction.toLowerCase()) {
			case "north":
				System.out.println("north ");
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
			case "east":
				System.out.println("east ");
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
			case "south":
				System.out.println("south ");
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
			case "west":
				System.out.println("west ");
				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
			default:
				System.out.println("What was that? Try again.");	
			break;
			}
		}	
	}	
}

