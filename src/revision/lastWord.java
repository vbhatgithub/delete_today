package revision;

import java.util.Scanner;

public class lastWord {
	
	public static void last() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter yr sentence");
		
		String sentence = sc.nextLine();
		
		int index = sentence.lastIndexOf(" ");
		
		String word = sentence.substring(index+1);
		
		System.out.println(word);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		last();

	}

}
