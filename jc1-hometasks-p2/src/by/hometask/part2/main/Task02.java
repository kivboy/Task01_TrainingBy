package by.hometask.part2.main;


/**
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 * 
 * @author ilya.krachkovsky
 *
 */

public class Task02 {

	public static void main(String[] args) {
		int[] sourceArray = {1, 4, 0, 4, 6, 0, 7, 12, 0, 56, 7, 0, 8};
		
		int[] zeroArray;
		
		// ищем нулевые элементы
		zeroArray = checkZero(sourceArray);
		
		// печатаем результат
		printArray(zeroArray);
	}
	
	// создание массива положения нулевых элементов
	public static int[] checkZero(int[] inputArray ) {
		int[] resultArray = new int[inputArray.length];
		
		int j = 0;  // счетчик результирующего массива
		
		for (int i = 0; i < inputArray.length; i++ ) {
			if (inputArray[i] == 0) {
				resultArray[j] = i + 1;
				j++;
			}
		}
		
		return resultArray;
	}

	// печать массива положения нулевых элементов
	public static void printArray(int[] inputArray) {
		int count = 0;
		
		System.out.println("Результат позиции нулевых элементов:");
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				count++;
				System.out.printf("%3d", inputArray[i]);
			}
		}
		
		if (count == 0) {
			System.out.println("\nНулевые элементы не найдены!");
		} else {
			System.out.printf("\nНайдено %d нулевых элементов.", count);
		}
			
	}
}
