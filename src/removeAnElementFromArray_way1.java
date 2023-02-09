import java.util.Scanner;

public class removeAnElementFromArray_way1 {

	public static void main(String[] args) {
		
		int[] array = {5,3,9,0,23,32};
		
		int[] newArr = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbver you want to delete");

		int numToDelete = sc.nextInt();
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] == numToDelete) {
				
				newArr = new int[array.length-1];
				
				for(int index=0;index<i;index++) {
					
					newArr[index] = array[index];
					
				}
				
				for(int j = i;j<array.length-1;j++) {
					newArr[j] = array[j+1]; 
				}
				
			}
			
		}
		
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i] + " ");
		}
		
	}

}
