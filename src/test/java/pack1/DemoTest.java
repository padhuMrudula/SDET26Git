package pack1;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demoTest() {
		System.out.println("reading data from cmd line");
		String url=System.getProperty("URL");
		String browser=System.getProperty("BROWSER");
		String username=System.getProperty("USERNAME");
		String password=System.getProperty("PASSWORD");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
		
	}

}
