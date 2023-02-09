
public class chk_for_system {
	
	void test4() {
		int i = 10/0;
		System.out.println(i);
	}
	
	void test3() {
	test4();
	}
	
	void test2() {
		try {
		test3();}
		catch(ArithmeticException e) {
			System.out.println("caught");
		}
	}
	
	
	void test1() {
		
		test2();
		System.out.println("insdie 1");
	}

	public static void main(String[] args) {
	
		try {
			Class.forName("GeeksForGeeks");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
	}
	
	

}
