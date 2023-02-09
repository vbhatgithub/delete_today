package Special_Chars;

public class pgm2_CheckPrimeNumbersBetween {
	
	public static void check(int low,int high) {
		
		while(low<high) {
			
			boolean flag = false;
			
			for(int i=2;i<=low/2;i++) {
				
				if(low % i == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(low + " ");
			}
			low++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
