package by.hometask.part2.main;

import org.junit.Assert;
import org.junit.Test;
import by.hometask.part2.main.Task19;

public class Task19Test {
	
	@Test
	public void Task19T01() {
		
		int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
		int expectedResult = 1;
				
		Assert.assertEquals(expectedResult, Task19.findFreqNumber(sourceArray));
	}
	
	@Test
	public void Task19T02() {
		
		int[] sourceArray = {6, -2, 4, 4, 4, 0, -2, -2, -2};
			
		int expectedResult = -2;
				
		Assert.assertEquals(expectedResult, Task19.findFreqNumber(sourceArray));
	}
	
	@Test
	public void Task19T03() {
		
		int[] sourceArray = {8};
			
		int expectedResult = 8;
				
		Assert.assertEquals(expectedResult, Task19.findFreqNumber(sourceArray));
	}
}
