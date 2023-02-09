package First5Pgms;

public class mycheck2 {
	
	
	
	private static int sum ;
	
	public  int getSum() {
		initialize();
		return sum;
	}
	
	private   boolean initialized = false;
	
	private   void initialize() {
		if(!initialized) {
			for(int i=0;i<100;i++) {
				sum+=i;
				initialized = true;
			}
		}
	}

	public static void main(String[] args) {
		mycheck2 obj = new mycheck2();
		int n = obj.getSum();
		System.out.println(n);
		
		
		mycheck2 obj1 = new mycheck2();
		int n1 = obj1.getSum();
		System.out.println(n1);
	}

}
