
public class Eka_Problem {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[5];
		
		int value = 1;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = value;
			value ++;
		}
		
		for(int j=0;j<arr.length+1;j++) {
			System.out.println(arr[j]);
		}

	}

}
