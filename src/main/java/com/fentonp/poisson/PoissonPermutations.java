package com.fentonp.poisson;

public class PoissonPermutations {
	private final Poisson check;
	
	public PoissonPermutations(double rate) {
		check = new Poisson(rate);
	}
	
	public double probOf(int numEvents, double timeInterval) {
		return check.calcProbOf(numEvents, timeInterval);
	}
	
	public double calcPermutationProb(double timeInterval, int numEvents, int segments) {
		double miniInterval = timeInterval / segments;
		
		return permProbAux(miniInterval, segments, numEvents);
	}
	
	private double permProbAux(double interval, int segments, int numEvents) {
		if (segments <= 1) {
			return probOf(numEvents, interval);
		}
		
		double prob = 0;
		
		for (int i = 0; i <= numEvents; i++) {
			double base = probOf(i, interval);
			
			prob += base * permProbAux(interval, segments - 1, numEvents - i);
		}
		
		return prob;
	}
}
