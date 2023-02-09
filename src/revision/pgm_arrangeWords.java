package revision;

public class pgm_arrangeWords {
	
	public static void arrange(String str) {
		
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			
			for(int j=i+1;j<words.length;j++) {
				
				
				if(words[j].length() < words[i].length()) {
					
					String temp = words[j];
					words[j] = words[i];
					words[i] = temp;
				}
			}
			
			
		}
		String s = conevrtArrayToString(words, " ");
		System.out.println(s);
	}
	
	
	public static String conevrtArrayToString(String[] words,String delimiter) {
		
		StringBuilder sb = new StringBuilder();
		
		for(String current_word : words) {
			
			sb.append(current_word).append(delimiter);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrange("this is crazy fun");

	}

}
