package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Avis1 {
	 String a = "chrome";
	@Test
 public void print() {
	if(a.contains("chr")) {
		 System.out.println("Avishek");
	}
	 System.out.println("Not present");
	 
 }
}
