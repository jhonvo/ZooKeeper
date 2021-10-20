package com.jhon.zookeeper;

public class GorillaTest {
	
	public static void main(String[] args) {
		Gorilla albert = new Gorilla();
		
		System.out.println(albert.throwSomething());
		System.out.println(albert.throwSomething());
		System.out.println(albert.throwSomething());
				
		System.out.println(albert.eatBananas());
		System.out.println(albert.eatBananas());
				
		System.out.println(albert.climb());
		
		
		albert.displayEnergy();
		
	}

}
