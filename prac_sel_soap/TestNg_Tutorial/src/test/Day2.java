package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Parameters({"URL","APIKey/username"})
	@Test
	public void SecondDay(String url,String name) {
		System.out.println(url + name);
	}

}
