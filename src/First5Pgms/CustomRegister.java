package First5Pgms;

import java.util.HashMap;
import java.util.Set;
//To do-
//https://www.geeksforgeeks.org/initialize-hashmap-in-java/
//https://www.javatpoint.com/java-hashmap
//https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
	
public class CustomRegister {
	
	
	HashMap<Integer,Integer> register ;
	
	CustomRegister(){
		register = new HashMap<Integer,Integer>();
	}
	
	
	void addAttendance(int[] a) {
		
		for(Integer id : a) {
			
			if(register.containsKey(id)) {
				register.put(id, register.get(id)+1);
			}
			
			else {
				register.put(id, 1);
			}
		}
	}
	
	
	void changeAttendance(int id,char c) {
		
		if(c == 'A') {
			register.put(id, register.get(id)-1);
			System.out.println("the attendance of " + id + "reduced by 1");
		}
	}
	
	void reduceRegister(int limit) {
		
		Set<Integer> idList = register.keySet();
		for(Integer id : idList) {
			
			if(register.get(id) < limit) {
				register.remove(id);
				
			}
		}
	}

}
