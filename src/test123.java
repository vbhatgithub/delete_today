
public abstract class test123{
	
	int age; 
	test123(int age){
		this.age = age;
	}
	
	abstract void fun();
	
	static void run() {
		System.out.println("inside fun");
	}
	
	
	public static void main(String[] args) {
		System.out.println("inside main");
		run();
	}

}
