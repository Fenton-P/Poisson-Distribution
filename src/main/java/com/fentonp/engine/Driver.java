package com.fentonp.engine;

import com.fentonp.poisson.*;

public class Driver {
	private static final double RATE = 10;
	private static final double TIME_INTERVAL = 5;
	private static final int SEGMENTS = 5;
	private static final int NUM_EVENTS = 5;
	
	public static void main(String[] args) {
		PoissonPermutations permCheck = new PoissonPermutations(RATE);
		
		System.out.println("Standard probability is: " + permCheck.probOf(NUM_EVENTS, TIME_INTERVAL));
		System.out.println("Permuation calculated probability is: " + permCheck.calcPermutationProb(TIME_INTERVAL, NUM_EVENTS, SEGMENTS));
	}

}
