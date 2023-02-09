
public class BlueYonder {
	
	public static String getStr(String str) {
		
		String[] words = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String currentWord : words) {
			
			char c = currentWord.charAt(0);
			sb.append(c);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = getStr("Java is a good programming language");
		System.out.println("The required string is " + s);

	}

}
