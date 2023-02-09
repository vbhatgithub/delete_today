import java.io.IOException;

public class runt_time {
	
	public void test2() throws IndexOutOfBoundsException {
		System.out.println("why");
		throw new IndexOutOfBoundsException("error");
		
	}
	
	
	public void test1() throws IOException {
		
		test2();
	}
	
	public  void test() {
		try{
			test1();
		}
		
		catch(Exception e) {
			System.out.println("IOExceptionhandled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runt_time obj = new runt_time();
		obj.test();
		System.out.println("end");

	}

}
