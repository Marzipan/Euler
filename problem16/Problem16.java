package problem16;

import java.math.BigInteger;


public class Problem16 {

	
	public static void main(String[] args) {
		
		int n = 1000;	// Power of 2 to Calculate digit sum of.
		
		BigInteger number = pow2(n);
		int answer = Problem16.sumDigits(number);
		System.out.println("The sum of digits of " + number.toString() + " is " + answer);
	}
	
	
	public static int sumDigits(BigInteger theThing){
		
		int numberLength = theThing.toString().length();
		int total  = 0;
		for(int i=1; i <= numberLength;i++){
			total += theThing.mod(BigInteger.valueOf(10)).intValue();
			theThing = theThing.divide(BigInteger.valueOf(10));
		}
		return total;
		
	}

	public static BigInteger pow2(int n){
		
		BigInteger number = BigInteger.valueOf(2);
		
		for(int i=1;i<n;i++){
			number = number.multiply(BigInteger.valueOf(2));
		}
		
		return number;
	}
}