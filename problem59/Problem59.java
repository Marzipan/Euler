package problem59;

public class Problem59 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//RETRIEVE DATA, STORE IN STRING "DATA"
		Input ins = new Input("cipher1.txt");
		String data = ins.getLine();
		/*String[] numdata = data.split(",");
		data = "";
		for (int i = 0; i < numdata.length;i++){
			data += (char) (Integer.valueOf(numdata[i]).intValue());
			
		}
		
		Encrypt en = new Encrypt(data);
		PassGen gen = new PassGen(3);
		
		String out="";
		
		while (true){
			if(out.contains("and") && out.contains("the")){
				System.out.println(out);
				}
			out = en.encrypt(gen.getPass());
			gen.createNext();
		}*/
		System.out.print(sumOfAscii(data));
		
	}

	public static int sumOfAscii(String s) {
		int tot = 0;
		for (int i = 0; i<s.length();i++){
			tot += (char) s.charAt(i);
		}
		return tot;
	}
	
	
}
