import java.util.Scanner;

public class removeAnElement {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5,3,8,9,0,1};
		
		int[] newArr = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number to delete");
		
		int numToDel = sc.nextInt();
		
		for(int i=0;i<array.length;i++) {
			
			if(numToDel == array[i]) {
				
				newArr = new int[array.length-1];
				
				for(int index=0;index<i;index++) {
					
					newArr[index] = array[index];
				}
				
				for(int j=i;j<array.length-1;j++) {
					
					newArr[j] = array[j+1];
					
				}
			}
			
		}
		
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]);
		}
		
	}

}
