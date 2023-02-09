package First5Pgms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfig {
	

	
	public static Properties resd(String fileName) throws IOException{
		
		FileInputStream fs = null;
		Properties prop = null;
		
		try {
			fs = new FileInputStream("./src/First5Pgms/abc.properties");
			prop = new Properties();
			prop.load(fs);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			fs.close();
		}
		return prop;
	}

	public static void main(String[] args) throws IOException {
		Properties prop = resd("./src/First5Pgms/abc.properties");
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

	}

}
