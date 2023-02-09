package First5Pgms;

import java.net.URI;
import java.net.URISyntaxException;

public class StringRelatedQuesitons {

	public static void main(String[] args) throws URISyntaxException {
	
		/*String str = " ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		
		System.out.println("******");
		
		String s1 = "null"+null+1;
		System.out.println(s1);
		
		System.out.println("******");
		
		System.out.println("ONE"+2+3+4+"FIVE");
		System.out.println("Java"+1000+2000+3000);
		
		System.out.println("A".compareTo("B"));
		System.out.println("B".compareTo("A"));
		
		"ABC123abc".chars().forEach(System.out::println);
		
		String mybame = "vin";
		System.out.println(mybame.charAt(3));*/
		
		URI uri = new URI("https://www.facebook.com/");
		String host = uri.getHost();
		
		String host1 = host.startsWith("www.")? host.substring(4) : host;
		System.out.println(host1);

		List<WebElement> links = driver
	
	}

}
