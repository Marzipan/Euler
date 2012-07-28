package problem16;
import java.math.BigInteger;


public class problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = problem25.fibonacci();
		System.out.println("Answer is " + ans);
	}
	
	public static int fibonacci(){
		BigInteger previous = BigInteger.valueOf(1);
		BigInteger temp;
		
		BigInteger currentSeq = BigInteger.valueOf(1);
		
		int f = 2;
		
		while(currentSeq.toString().length() != 1000){
			temp = previous;
			previous = currentSeq;
			currentSeq = currentSeq.add(temp);
			f++;
		}
		
		return f;
		
	}
	
}
