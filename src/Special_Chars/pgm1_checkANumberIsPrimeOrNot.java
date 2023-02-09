package Special_Chars;

public class pgm1_checkANumberIsPrimeOrNot {
	
	public static void check(int number) {
		
		boolean flag = false;
		
		for(int i=2; i<=number/2; i++) {
			
			if(number % i == 0) {
				flag = true;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println(" Its not a prime");
		}
		
		else {
			System.out.println(" Its a prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(3);
		

	}

}
