package revision;

import java.util.HashMap;
import java.util.Map;

public class pgm2_maximin {

	public static void max(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c) + 1);
			}
			
			else {
				map.put(c, 1);
			}
			
		}
		
		int value = 0;
		char key = ' ';
		
		for(Map.Entry<Character,Integer> set : map.entrySet()) {
			
			if(set.getValue() > value) {
				
				value = set.getValue();
				key = set.getKey();
			}
			
			
			
			
			
		}
		
		System.out.println("most char are " + key);
		
	}
	
	
	public static void main(String[] args) {
		
		max("vinaya");

	}

}
