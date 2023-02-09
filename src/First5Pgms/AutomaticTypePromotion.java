package First5Pgms;

public class AutomaticTypePromotion {
	
	// A method that accept integer as parameter
    public static void method(int i)
    {
        System.out.println(
            "Automatic Type Promoted to Integer-" + i);
    }
   
    // A method that accept double as parameter
    public static void method(double d)
    {
        System.out.println(
            "Automatic Type Promoted to Double-" + d);
    }
   
    // A method that accept object as parameter
    public static void method(Object o)
    {
        System.out.println("Object method called");
    }
   
    public static void main(String[] args)
    {
        // method call with char as parameter
        method('a');
       
        // method call with int as parameter
        method(2);
       
        // method call with float as parameter
        method(2.0f);
       
        // method call with a string as parameter
        method("Geeks for Geeks");
    }

}
