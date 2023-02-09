package revision;

public class pgm3_pat {
	
	public static void pat(int n) {
		
		for(int row=1;row<(2 * n);row++) {
			
			int columns = row > n ? (2 * n)-row : row;
			
			for(int col=1;col<=columns;col++) {
				
				System.out.print(col);
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pat(5);
	}

}
