package MavenDemo;

import org.testng.annotations.Test;

public class APITest {

	@Test
	public void postJira() {
		System.out.println("I am in postJira");
		System.out.println("I am in postproJira");

	}
	
	@Test
	public void deleteTwitter() {
		System.out.println("I am in deleteTwitter");
	}
	
	@Test
	public void deleteFacebook() {
		System.out.println("I am in deleteFacebook");
	}
}
