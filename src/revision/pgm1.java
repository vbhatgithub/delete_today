package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pgm1 {
	
	public static void pgm(String str, List<String> list) {
		
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		
		for(String current_word : words) {
			
		
			
			if(!list.contains(current_word)) {
				
				char c = current_word.charAt(0);
				sb.append(Character.toUpperCase(c)).append(current_word.substring(1)).append(" ");
				
			}
			
			else {
				sb.append(current_word).append(" ");
			}
		}
		
		
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>(Arrays.asList("is","fun"));

pgm("this is crazy and fun",list);



	}

}
