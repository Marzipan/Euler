package problem59;

public class Encrypt {
	
	public Encrypt(String data) {
		this.data = data.toCharArray();
	}
	
	private char[] data;
	
	public void setData(String encryptData){
		data = encryptData.toCharArray();
	}
	
	public String encrypt(String key){
		
		String result = "";

		for(int i = 0; i< data.length;i++){
			
			
			result += xor(data[i],key.charAt(i%key.length()));
		}
		
		return result;
	}
	
	// takes 2 characters and xors the first against the second
	private char xor(char c, char d){
		int char1 = (int) c;
		int char2 = (int) d;
		return (char) (char1 ^ char2);
	}
	
}
