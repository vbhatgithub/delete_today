package naveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class test_1 {
	
	
	public static boolean test(String[] str) {
		
		for(int i=0;i<str.length;i++) {
			
			
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i].compareTo(str[j]) > 0) {
					return false;
				}
				
			}
			
		}
		
		return true;
		
	}

	public static void main(String[] args)  {
		
		String[] array = {"aini","berkkd","cekkkf"};
		
		boolean b = test(array);
		
		System.out.println(b);
		
	}

}
