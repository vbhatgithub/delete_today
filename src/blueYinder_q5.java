import java.util.ArrayList;
import java.util.List;

public class blueYinder_q5 {
	
	public static List<Integer> sortedArray(int[] array) {
		
		
		List<Integer>Lists = new ArrayList<>();
		
		for(int i=0;i<array.length;i++) {
			Lists.add(array[i]);
		}
		
		
		
		List<Integer> sorted = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			sorted.add(array[i]);
		}
		
		for(int i=Lists.size();i >Lists.size()-3 ;i--) {
			sorted.add(array[i-1]);
			sorted.add(index, element);
		}
		
		return sorted;
	
	}
	

	public static void main(String[] args) {
		
		int[] array = {5,10,15,20,25,30,35,40,45,50};
		List<Integer> reqList = sortedArray(array);
		for(int i=0;i<reqList.size();i++) {
		System.out.print(reqList.get(i) + " ");
		}
	}

}
