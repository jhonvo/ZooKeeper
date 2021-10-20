package com.jhon.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergy(300);
	}
	
	public int fly() {
		int newEnergy = this.getEnergy() - 50;
		this.setEnergy(newEnergy);
		System.out.println("The Bat is taking off and his energy level has decreased by 50... YOU BETTER LOOK FOR SHELTER");
		return newEnergy;
	}
	
	
	public int eatHumans() {
		int newEnergy = this.getEnergy() + 25;
		this.setEnergy(newEnergy);
		System.out.println("A humam did not find shelter and the Bat is eating (⊙_ʖ⊙), its energy level has increased by 25");
		return newEnergy;
	}
	
	public int attackTown() {
		int newEnergy = this.getEnergy() - 100;
		this.setEnergy(newEnergy);
		System.out.println("The Bat is hungry and is setting the town on fire!!! 炎炎炎炎 His is energy level has decreased by 100... YOU BETTER LOOK FOR SHELTER");
		return newEnergy;
	}
	
	
	

}
