package First5Pgms;

public class JavaStringsQuiz {
	
	public static void main(String[] args) 
    {
		StringBuffer sb = new StringBuffer("One Two Three Four Five");
		
		System.out.println(sb.reverse());
        
        System.out.println(sb.reverse().indexOf("Two"));
    }

}
