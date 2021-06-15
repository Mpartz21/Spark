package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String args[]) {
		int menuSelection = 0;
		
		while(menuSelection != 4) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please select an option: \n"+
					"1. Volume Conversions \n"+
					"2. Distance Conversions \n"+
					"4. Quit");
			switch(menuSelection = scanner.nextInt()) {
			case 1:
				System.out.println("Please select an option: \n"+
					"1. Teaspoons to Tablespoons \n"+
					"2.Teaspoons to Cups \n"+
					"4. Quit");
				switch(menuSelection = scanner.nextInt()) {
				case 1:
					teaspoonsToTablespoons();
					break;
				case 2:
					teaspoonsToCups();
					break;
				case 4:
					System.out.println("Quit");
					menuSelection = 4;
					break;
				default:
					System.out.println("Invalid please try again");
					break;
				}
				break;
			
				
			case 2:
				System.out.println("Please select an option: \n"+
						"1. Feet to Meters \n"+
						"2. Miles to Kilometers \n"+
						"4. Quit");
				switch(menuSelection = scanner.nextInt()) {
				case 1:
					feetToMeters();
					break;
				case 2:
					milesToKilometers();
					break;
				case 4:
					System.out.println("Quit");
					menuSelection = 4;
				default:
					System.out.println("Invalid please try again");
					break;
				}
				break;
				
			case 4:
				System.out.println("Quit");	
				break;
			default:
				System.out.println("Invalid please try again");
				break;
			}
			scanner.close();
		}
	
		System.out.println("Convertor shut down");
		
		
	}
	
	public static void teaspoonsToCups() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many teaspoons would you like to measure into cups?");
		double teaspoons = scanner.nextDouble();
		double cups = teaspoons/48 ;
		System.out.println("You have " + teaspoons + " teaspoons which is equal to " + cups + " cups");
	}
	
	public static void usGallonstoImperialGallons() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many US Gallons would you like to measure into Imperial Gallons?");
		double usGallons = scanner.nextDouble();
		double imperialGallons = usGallons *  0.83267;
		System.out.println("You have " + usGallons + " US Gallons which is equal to " + imperialGallons + " Imperial Gallons");	
	}
	
	public static void milesToKilometers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many miles would you like to measure into kilometers?");
		double miles = scanner.nextDouble();
		double kilometers = miles * 1.60934;
		System.out.println("You have " + miles + " miles"
				+ " which is equal to " + kilometers + " kilometers");
	}
	
	public static void feetToMeters() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many feet would you like to measure into meters?");
		double feet = scanner.nextDouble();
		double meters = feet /3.281;
		System.out.println("You have " + feet + " feet"
				+ " which is equal to " + meters + " meters");
	}
	
	public static void teaspoonsToTablespoons() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many teaspoons would you like to measure into tablespoons?");
		double teaspoons = scanner.nextDouble();
		double tablespoons = teaspoons /3;
		System.out.println("You have " + teaspoons + " teaspoons"
				+ " which is equal to " + tablespoons + " tablespoons");
	}
}
