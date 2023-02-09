package First5Pgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadAConfugFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = read();
		
		String name = prop.getProperty("key");
		System.out.println(name);
	}
	
	
	public static Properties read() throws IOException {
		
		Properties prop = null;
		FileInputStream fs = null;
		
		try {
			
			fs = new FileInputStream("C:\\vinaya\\test.txt");
			prop = new Properties();
			prop.load(fs);
		}
		
		catch(FileNotFoundException e) {
			
		}
		
		finally {
			fs.close();
		}
		return prop;
	}

}
