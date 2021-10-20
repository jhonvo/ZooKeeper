package com.jhon.zookeeper;

public class Gorilla extends Mammal {
	
	public String throwSomething() {
		int newEnergy = this.getEnergy() - 5;
		this.setEnergy(newEnergy);
		return "The Gorilla has thrown something and his energy level has decreased by 5";
	}
	
	public String eatBananas() {
		int newEnergy = this.getEnergy() + 10;
		this.setEnergy(newEnergy);
		return "The Gorilla is happy for the banana he just ate, his energy level has increased by 10";
	}
	
	public String climb() {
		int newEnergy = this.getEnergy() - 10;
		this.setEnergy(newEnergy);
		return "The Gorilla has climbed a tree and his energy level has decreased by 5";
	}
	
	
}
