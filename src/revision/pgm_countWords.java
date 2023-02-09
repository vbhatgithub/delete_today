package revision;

public class pgm_countWords {
	
	public static void count(String str) {
		
		int count = 1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == ' '   && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count("this is r=crazy fun dera");

	}

}
