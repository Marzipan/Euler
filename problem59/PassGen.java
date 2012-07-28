package problem59;

public class PassGen {

	private String s = "";
	private char[] c;
	int carry;
	
	// Creates new PassGen object to generate passwords of length n
	PassGen(int n){
		c = new char[n];
		for (int i = 0; i < c.length;i++){
			c[i] = 'a';
		}
	}
	
	//increment the password "e.g" "abc" -> "abd"
	//"abz" -> "aca"
	public void createNext() {
		int lastIndex = c.length-1;
		
		while(c[lastIndex] == 'z'){
			c[lastIndex] = 'a';
			lastIndex--;
		}
		
		//
		int currentChar = (int)c[lastIndex];
		c[lastIndex] = (char) (currentChar + 1);
	}

	public String getPass() {
		
		s = "";
		//combine characters in array
		for (int i = 0; i < c.length;i++){
			s += c[i];
		}
		
		return s;
	}
	
	public void test(){
		for(int i = 0; i<100; i++){
			System.out.println(this.getPass());
			this.createNext();
		}
	}
	
}
