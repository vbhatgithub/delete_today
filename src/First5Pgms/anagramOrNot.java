package First5Pgms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagramOrNot {
	
	
	public static void anagramOrNot(String str1,String str2) {
		
		if(str1.length() != str2.length()) {
			System.out.println("its not");
			return;
		}
		
		
		HashMap map1 = hashMap(str1);
		
		HashMap map2 = hashMap(str2);
		
		if(map1.equals(map2)) {
			System.out.println("its a anagram");
		}
		
		else {
			System.out.println("its not");
		}
	}
	
	
	public static HashMap<Character,Integer> hashMap(String str) {
		
		HashMap<Character,Integer> hashmap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}
			
			else {
				hashmap.put(c, 1);
			}
		}
		
		return hashmap;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 anagramOrNot("vinaya","ainaayv");
	
	}

}
