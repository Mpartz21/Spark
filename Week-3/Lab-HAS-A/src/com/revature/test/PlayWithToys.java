package com.revature.test;
import com.revature.model.*;


public class PlayWithToys {
	public static void main(String[] args) {
		Doll doll = new Doll("Annabelle","blue");	
		System.out.println("Our doll "+doll.getName()
	                  +" has "+doll.getEyeColor()+" eyes.");
		doll.play();
		doll.makeTalk();
		ActionFigure testFigure = new ActionFigure("Barry Allen","blue","speed");
		System.out.println("Our action figure " + testFigure.getName() + " has "
							+ testFigure.getEyeColor() + " eyes and " + testFigure.getSkill() + " skill");
		testFigure.makeTalk();
		testFigure.play();
		testFigure.useSkill();
		
		
	 }
}
