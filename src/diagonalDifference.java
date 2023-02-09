
public class diagonalDifference {
	
	public static void diagonal(int[][] array) {
		
		int leftSum = 0;
		int rightSum = 0;
		
		int n = array.length;
		
		for(int i=0;i<n;i++) {

			leftSum = leftSum + array[i][i];
			
			rightSum = rightSum + array[i][n-1-i];
			
			int diff = Math.abs(leftSum - rightSum);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
