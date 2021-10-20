package com.jhon.zookeeper;

public class BatTest {
	
	public static void main(String[] args) {
		Bat rare = new Bat();
		
		rare.displayEnergy();
		
		rare.attackTown();
		rare.attackTown();
		rare.attackTown();
		
		rare.eatHumans();
		rare.eatHumans();
		
		rare.fly();
		rare.fly();
		
		rare.displayEnergy();
		
	}

}
