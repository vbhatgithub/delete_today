package naveen;

public class pgm_largestSubArray {
	
	
	public static int largest(int[] array,int n) {
		
		int len=1; int max = 1;
		
		for(int i=1;i<n;i++) {
			
			
			if(array[i] > array[i-1]) {
				len++;
			}
			
			else {
				
				if(max < len) {
					max = len;
				}
				
				len=1;
			}
			
		}
		
		
		if(max < len) {
			max = len;
		}
		return max;
	}

	public static void main(String[] args) {

		int[] array = {5, 6, 3, 5, 7, 8, 9, 1, 2};
		int n = largest(array,array.length);
		System.out.println(n);
	}

}
