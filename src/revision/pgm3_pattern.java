package revision;

public class pgm3_pattern {
	
	public static void pattrne(int n) {
		
		for(int row=1;row<=(2 * n);row++) {
			
			int cols = row > n ? (2 * n) - row :row;
			
			for(int col=1;col<=cols;col++) {
				
				System.out.print(col);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattrne(5);

	}

}
