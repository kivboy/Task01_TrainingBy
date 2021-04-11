package by.hometask.part2.main;

import org.junit.Assert;
import org.junit.Test;
import by.hometask.part2.main.Task20;

public class Task20Test {
	@Test
	public void Task20T01() {
		
		int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
		int[] expectedResultArray = {1, 3, 5, 7, 9, 0, 0, 0, 0};
		
		Task20.printArr(sourceArray);
		// сжимаем массив
		Task20.compressArr(sourceArray);
		
		System.out.println();
		
		Task20.printArr(sourceArray);
		System.out.println("\n-------------------------------\n");
		
		Assert.assertArrayEquals(expectedResultArray, sourceArray);
	}
	
	@Test
	public void Task20T02() {
		
		int[] sourceArray = {1, 2, 3, 4};
			
		int[] expectedResultArray = {1, 3, 0, 0};
		
		Task20.printArr(sourceArray);
		// сжимаем массив
		Task20.compressArr(sourceArray);
		
		System.out.println();
		
		Task20.printArr(sourceArray);
		System.out.println("\n-------------------------------\n");
		
		Assert.assertArrayEquals(expectedResultArray, sourceArray);
	}
		
	@Test
	public void Task20T03() {
		
		int[] sourceArray = {1, 2, 3};
			
		int[] expectedResultArray = {1, 3, 0};
		
		Task20.printArr(sourceArray);
		// сжимаем массив
		Task20.compressArr(sourceArray);
		
		System.out.println();
		
		Task20.printArr(sourceArray);
		System.out.println("\n-------------------------------\n");
		
		Assert.assertArrayEquals(expectedResultArray, sourceArray);
	}
	
	@Test
	public void Task20T04() {
		
		int[] sourceArray = {1, 2};
			
		int[] expectedResultArray = {1, 0};
		
		Task20.printArr(sourceArray);
		// сжимаем массив
		Task20.compressArr(sourceArray);
		
		System.out.println();
		
		Task20.printArr(sourceArray);
		System.out.println("\n-------------------------------\n");
		
		Assert.assertArrayEquals(expectedResultArray, sourceArray);
	}
	
	@Test
	public void Task20T05() {
		
		int[] sourceArray = {1};
			
		int[] expectedResultArray = {1};
		
		Task20.printArr(sourceArray);
		// сжимаем массив
		Task20.compressArr(sourceArray);
		
		System.out.println();
		
		Task20.printArr(sourceArray);
		System.out.println("\n-------------------------------\n");
		
		Assert.assertArrayEquals(expectedResultArray, sourceArray);
	}
}
