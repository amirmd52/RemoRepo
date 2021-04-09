package tuesday209;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Base {

	@BeforeClass
	public static void start1() {
		System.out.println("go to url");
		
	}
	@AfterClass
	public static void end1() {
		//close browser
		System.out.println("close browser");
	}
	
	
	//@Before
	//public void start() {
		//System.out.println("go to url");
		
	//}
	//@After
	//public void end() {
		//close browser
		//System.out.println("close browser");
	//}
}

