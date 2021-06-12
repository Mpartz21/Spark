package com.revature.model;

public class ActionFigure extends Doll {
	private String skill;

	
	public ActionFigure() {
		this.name = "Ash Ketchum";
		this.eyeColor = "green";
		this.skill = "Catch'em All";
	}
	
	public ActionFigure(String name,String eyeColor,String skill) {
		this.name = name;
		this.eyeColor = eyeColor;
		this.skill = skill;
	}
	
	public void useSkill() {
		System.out.println("Ka Pow! I'm using my skill, "+ this.skill);
	}
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String action) {
		this.skill = skill;
	}
}
