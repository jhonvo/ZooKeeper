package com.jhon.zookeeper;

public class Mammal {
	private int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	
	// Getter:
	
	public int getEnergy() {
		return this.energyLevel;
	}
	
	// Setter 
	
	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}
	
	public int displayEnergy() {
		System.out.println("The current level of energy is: " + this.getEnergy());
		return this.getEnergy();
	}
		
}
