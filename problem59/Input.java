package problem59;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Input {
	
	FileReader fr;
	BufferedReader br;
	
	public Input(String filename) {
		try {
			fr = new FileReader("C:\\Users\\Matt\\Desktop\\"+filename);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e){
			System.out.println("File \"" + filename + "\" does not exist!" );
		}
	}
	
	public String getLine(){
		try {		
			return br.readLine();
		} catch (IOException e) {
			System.out.println("exception!!!\n");
			e.printStackTrace();
			return "";
		}
	}
	
}
