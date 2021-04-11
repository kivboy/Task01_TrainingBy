package by.hometask.part3.main;

import org.junit.Assert;
import org.junit.Test;

public class Task13Test {
	// Тестирование генерации матрицы
	@Test 
	public void Task13T01() {

		int size = 6;

		int[][] actualMatrix;

		actualMatrix = Task13.generateMatrix(size);

		int[][] expectedMatrix = { { 1, 2, 3, 4, 5, 6 }, 
								   { 6, 5, 4, 3, 2, 1 }, 
								   { 1, 2, 3, 4, 5, 6 },
								   { 6, 5, 4, 3, 2, 1 }, 
								   { 1, 2, 3, 4, 5, 6 }, 
								   { 6, 5, 4, 3, 2, 1 } };

		Assert.assertArrayEquals(expectedMatrix, actualMatrix);
	}

	// Тестирование генерации матрицы для малого размера
	@Test
	public void Task13T02() {

		int size = 2;

		int[][] actualMatrix;

		actualMatrix = Task13.generateMatrix(size);

		int[][] expectedMatrix = { { 1, 2 }, 
								   { 2, 1 } };

		Assert.assertArrayEquals(expectedMatrix, actualMatrix);
	}
}
