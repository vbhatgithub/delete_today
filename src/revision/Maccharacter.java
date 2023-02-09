package revision;

import java.util.HashMap;
import java.util.Map;

public class Maccharacter {
	
	public static void max(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character c : str.toCharArray()) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			
			else {
				map.put(c, 1);
			}
		}
		
		Character key = ' ';
		Integer value = 0;
		
		for(Map.Entry<Character,Integer> set : map.entrySet()) {
			
			if(set.getValue() > value) {
				value = set.getValue();
				key = set.getKey();
			}
			
		}
		
		System.out.println("high char os " + key + "and valuye is " + value);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max("ivinaiyai");
	}

}
