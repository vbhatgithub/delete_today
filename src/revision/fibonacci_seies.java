package revision;

public class fibonacci_seies {
	
	//0 1 1 2 3 5
	public static void fibonnaci(int n) {
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i=1;i<n;i++) {
			
			int sum = num1 + num2;
			
			num1 = sum;
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
