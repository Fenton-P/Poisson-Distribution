package com.fentonp.poisson;

public class Poisson {
	private final double rate;
	
	public Poisson(double rate) {
		this.rate = rate;
	}
	
	public double calcProbOf(int numEvents, double timeInterval) {
		double mean = rate * timeInterval;
		
		return Math.exp(-mean) * Math.pow(mean, numEvents) / factorial(numEvents);
	}
	
	private int factorial(int num) {
		int total = 1;
		
		while (num > 1) {
			total *= num--;
		}
		
		return total;
	}
}
