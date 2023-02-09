
public class BlueYonder_Question2 {
	
	public static String reverseEachWord(String str) {
		
		String[] words = str.split(" ");
		
		String reverse = "";
		
		for(int i=0;i<words.length;i++) {
			
			for(int j=words[i].length()-1;j>=0;j--) {
			
			reverse = reverse + words[i].charAt(j) ;
			
		}
			reverse = reverse + " ";
		}
		
		
		return reverse;
	}

	public static void main(String[] args) {
	
		String s = reverseEachWord("Sachin Prakash Dubey");
		System.out.println(s);

	}

}
