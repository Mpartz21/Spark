package game;

import java.util.Scanner;

public class Main {

	public static void main(String Args[]) {
		
	}
	public static void printRoom(Player player) {
		System.out.println();
	}
	
	public static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		String[] inputCommands= scanner.next().split(" ");
		return inputCommands;
	}
	
	public static void parse(String[] inputCommands,Player player) {
		
	}
}
