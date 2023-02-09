package First5Pgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ReadConfigFile {
	
	public static Properties readConfig() throws IOException {

		FileInputStream fs = null;
		Properties prop = null;
		
		try {
			fs = new FileInputStream("C:\\Vinaya\\test.txt");
			prop = new Properties();
			prop.load(fs);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	

	public static void main(String[] args) throws IOException {
	
	Properties prop = readConfig();
	System.out.println(prop.getProperty("key"));

	}

}
