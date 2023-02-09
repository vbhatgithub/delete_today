package First5Pgms;

import java.util.Arrays;

public class largetsNumber {
	
	public static void largets(int[] array) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] > max) {
				max = array[i];
			}
			
			else if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	//	return new int[max][min];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = {0,1,6,9,3,5};
		 largets(arra);
		
	

	}

}
