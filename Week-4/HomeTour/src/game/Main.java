package game;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import fixtures.Room;
import game.RoomManager;

public class Main {




	public static void main(String Args[]) {
		System.out.println("Please type in lower case only.");
		
		RoomManager roomManager = new RoomManager();
		
		roomManager.init();
		
//		System.out.println(roomManager.getStartingRoom().getName());	
		
		Player player = new Player();
		
		player.setPlayerName();
		
		player.setCurrentRoom(roomManager.getStartingRoom());
		
//		player.getCurrentRoom().setExits("start",roomManager.getStartingRoom());
		
		boolean running = true;
		do {
			printLongDescription(player);
			printExits(player);
			String[] inputCommands = collectInput();
			running = parse(inputCommands,player);	 
		}while(running);
		System.out.println("Thank You, Come Again");
		
	}
	public static void printExits(Player player) {
		Room currentRoom = player.getCurrentRoom();
		Map<String,Room> exits = currentRoom.getExits();
		System.out.println("Commands: 'go' and a direction");
		System.out.println("Choose an exit:");
		int i= 0;
		for(Entry<String, Room> exit : exits.entrySet()) {
			i++;
			System.out.println("Go " + exit.getKey() + ": " + exit.getValue().getName());
		}
		System.out.println("quit: quit");
	}
	
	public static void printRoom(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside the "+ player.getCurrentRoom().getName());
	}
	
	public static void printShortDescription(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside the "+ player.getCurrentRoom().getShortDescription());
	}
	
	public static void printLongDescription(Player player) {
		System.out.println(player.getPlayerName().toUpperCase()+" is inside "+ player.getCurrentRoom().getLongDescription());
	}
	
	public static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputCommands = input.split(" ");
   		return inputCommands;
	}
	
	
	public static boolean parse(String[] inputCommands,Player player) {
	
	switch( inputCommands[0]) {
	
		case ("go"):
			if(player.getCurrentRoom().getExit(inputCommands[1]) == null) {
				System.out.println("What was that? Try again.");
				return true;
			}
			System.out.println("Going ");
			System.out.println(player.getCurrentRoom().getExit(inputCommands[1]).getName());
			player.setCurrentRoom(player.getCurrentRoom().getExit(inputCommands[1]));
			System.out.println(player.getCurrentRoom().getName());
			return true;
		case("quit"):
			return false;			
		}	
	System.out.println("What was that? Try again.");
	return true;
	}
}
	//I made this first and after a little more digging found that i was over complicating this task
//			switch(direction.toLowerCase()) {
//			case "north": 
//				System.out.println("north");
//				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
//				System.out.println(player.getCurrentRoom().getName());
//
//				break;
//			case "east":
//				System.out.println("east");
//				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
//				System.out.println(player.getCurrentRoom().getName());
//
//				break;
//			case "south":
//				System.out.println("south");
//				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
//				System.out.println(player.getCurrentRoom().getName());
//
//				break;
//			case "west":
//				System.out.println("west");
//				player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
//				System.out.println(player.getCurrentRoom().getName());
//
//				break;
//			default:
//				System.out.println("What was that? Try again.");
//				System.out.println(player.getCurrentRoom().getName());
//
//				printExits(player);
//			break;
//			}


