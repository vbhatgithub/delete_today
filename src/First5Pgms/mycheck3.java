package First5Pgms;

public class mycheck3 {
	
	static int i=90;
	int j;
	
	public static void test() {
		i = 100;
		System.out.println(i);
	}
	
	BiConsumer<Integer,Integer> biconsumer = (a,b) -> System.out.println(a+b); 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mycheck3.i);
		test();

	}

}
