package revision;

public class binarySearch {
	
	public static void binary(int[] array,int target) {
		
		int left = 0;
		int right = array.length-1;
		int mid = 0;
		
		while(left <= right) {
			
			mid = left + ((right - left)/2);
			
			if(target == array[mid]) {
				return mid;
			}
			
			
			if(target < array[mid]) {
				right = mid -1;
			}
			
			else {
				left = mid +1;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
