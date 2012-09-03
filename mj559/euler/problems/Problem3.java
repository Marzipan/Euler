package mj559.euler.problems;

import java.math.BigInteger;

import mj559.euler.util.Timer;

public class Problem3 implements Problem {

	/* 
	 * Problem 3:
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	
	// Perform sieve of eratosthenes
	public static boolean[] primeSieve(int n){
		
		boolean[] values = new boolean[(int) n];
		
		// Init array to false
		for(int i = 0; i < values.length; i++){
			values[i] = true;
		}
		
		// Sieve!
		int sqrt_n = (int) Math.ceil(Math.sqrt(values.length));
		
		for(int i = 2; i < sqrt_n; i++){
			if (values[i]){
				for (int j = i*i; j < n; j += i){
						values[j] = false;
				}
			}
		}


		return values;
	}
	
	@Override
	public void solve() {
		
		BigInteger b = new BigInteger("600851475143");
		int n = 7751467;
		Timer.start();
		
		// Get array indicating primes
		boolean[] values = primeSieve(n);
		
		// Check whether each prime divides 600851475143. Badly
		// Probably a better way of doing this than creating a new BigInt for every prime.
		long result = -1;
		for (int i = 1; i < values.length; i++){
			BigInteger b2 = new BigInteger(Integer.toString(i));
			if(values[i] && b.remainder(b2).equals(BigInteger.ZERO)){
				result = i;
			}
		}
		long time = Timer.stop();
		
		System.out.println("The solution is: " +  result);
		System.out.println("Took " + time + "ms.");
		
	}

	public static void main(String[] args) {
		Problem p = new Problem3();
		p.solve();
	}
}
