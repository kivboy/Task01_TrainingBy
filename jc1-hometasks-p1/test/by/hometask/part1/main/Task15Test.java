package by.hometask.part1.main;

import org.junit.Assert;
import org.junit.Test;

public class Task15Test {
	
	@Test
	public void Task15T01() {
		
		double x = 10;
		double delta = 0.0000000001;
		
		double expectedResult = -5.7610300125; //-5.76103001249318;
		
		Assert.assertEquals(expectedResult, Task15.function(x), delta);		
		
	}
	
	@Test
	public void Task15T02() {
		
		double x = 120;
		double delta = 0.0000000001;
		
		double expectedResult = 1.64008077876; // 1,640080778759126;
		
		Assert.assertEquals(expectedResult, Task15.function(x), delta);		
		
	}

}
