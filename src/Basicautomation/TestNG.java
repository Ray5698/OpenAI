package Basicautomation;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
		
	}
	@Test
	public void test() {
		System.out.println("test method");
	}



}
