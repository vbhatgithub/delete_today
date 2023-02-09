
public class ReThrowingAnException {
	
	static void fun() {
		
		try {
		
		throw new NullPointerException("demo");
		}
		
		catch(NullPointerException e) {
			System.out.println("insode fun");
			throw e;
		}
	}

	public static void main(String[] args) {
		
		try{
			fun();
		}
		
		catch(NullPointerException e) {
			System.out.println("Insode main");
		}

	}

}
