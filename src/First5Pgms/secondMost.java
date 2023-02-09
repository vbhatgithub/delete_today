package First5Pgms;

import java.util.HashMap;
import java.util.Map;

public class secondMost {
	
	public static void second(String str) {
		
	int[] array = new int[str.length()]	;
	
	for(int i=0;i<str.length();i++) {
		
		char c = str.charAt(i);
		
		array[c - 'a']++;
	}

	int first=0;
	int second=0;
	
	for(int i=0;i<array.length;i++) {
		
		if(array[i] > first) {
			
			first = array[i];
			second = first;
		}
		
		else if(array[i] > second && array[i]!= first) {
			second = array[i];
		}
	}
	
		char c = second + 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
