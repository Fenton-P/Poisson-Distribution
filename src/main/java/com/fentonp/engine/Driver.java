package com.fentonp.engine;

public class Driver {
	private final static int EXPECTED_ARGS = 0;
	
	public static void main(String[] args) {
		if (args.length != EXPECTED_ARGS) {
			System.out.println("TEST");
			
			return;
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	}

}
