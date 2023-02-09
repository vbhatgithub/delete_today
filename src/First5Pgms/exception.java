package First5Pgms;

import java.io.FileNotFoundException;
import java.io.IOException;

public class exception {

	public static void main(String[] args)  {
	String s1 = "java";
	
	String s1 = new String("kkakak");

	}
	
	public static void method(int age) throws IOException  {
		if(age < 18) {
			throw new IOException();
		}
	}

}
