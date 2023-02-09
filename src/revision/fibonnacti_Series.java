package revision;

public class fibonnacti_Series {
	
	
	public static void fibonacci(int n) {
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(num1);
			
			int sum = num1 + num2;
			
			num1 = num2;
			num2 = sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(10);

	}

}
