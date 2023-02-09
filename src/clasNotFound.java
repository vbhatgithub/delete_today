import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class clasNotFound {
	
	public static void chkForEligiblity() throws IOException {
		
		
			throw new IOException("not eligible for exception");
		
		
		
	}
	
	public static void test() {
		chkForEligiblity();
	}
	
	public static void testDat(int data) throws IOException {
		
		if(data<100) {
			throw new IOException("data is less");
		}
		
		chkForEligiblity();
		
	}

	public static void main(String[] args) throws FileNotFoundException  {
	
	
	}

}
