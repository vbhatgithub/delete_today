package First5Pgms;

public class factorialNumber {
	
	public static int factorial(int num) {
		
		while(num > 0) {
			
			return factorial(num -1) * num;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = factorial(5);
		System.out.println(n);
	}

}
