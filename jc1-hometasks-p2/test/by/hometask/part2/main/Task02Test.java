package by.hometask.part2.main;

import org.junit.Assert;
import org.junit.Test;
import by.hometask.part2.main.Task02;

public class Task02Test {
	@Test
	public void Task02T01() {
		
		int sourceArray[] = new int[] {5, 0, 2, 3, 4, 0, 7, 0, 0, 8};
		
		int zeroArray[];
		
		int expectedResultArray[] = new int[] {2, 6, 8, 9, 0, 0, 0, 0, 0, 0};
		
		// ищем нулевые элементы
		zeroArray = Task02.checkZero(sourceArray);
				
		Assert.assertArrayEquals(expectedResultArray, zeroArray);
	}
}
