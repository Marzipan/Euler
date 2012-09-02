package mj559.euler.problems;

import mj559.euler.util.Timer;

/**
 * Problem 1:
 * 
 * If we list all the natural numbers below 10 that are multiples 
 * of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is
 * 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 */

public class Problem1 implements Problem {
	
	@Override
	public void solve() {
		
		Timer.start();
		int total = 0;
		for(int i = 0; i < 1000; i++){
			if (i % 5 == 0 || i % 3 == 0){
				total += i;
			}
		}
		long time = Timer.stop();
		System.out.println("The solution is: " +  total);
		System.out.println("Took " + time + "ms.");
	}

	public static void main(String[] args) {
		Problem p = new Problem1();
		p.solve();
	}
}
