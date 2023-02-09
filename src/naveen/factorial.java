package naveen;

public class factorial {
	
	public static int fact(int num) {
		
		if(num > 1) {
			return fact(num -1 ) * num;
		}
		
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = fact(5);
		System.out.println(n);

	}

}
