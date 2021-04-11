package by.hometask.part2.main;

/**
 * 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него 
 * каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 * 
 * @author Ilya
 *
 */

public class Task20 {

	public static void main(String[] args) {
		//int[] mas = {1,2,3,4,5,6,7,8,9};
		int[] mas = {1,2,3,4,5,6,7,8,9};
		
		compressArr(mas);
		
		// {1,0,3,0,5,0,7,0,9} = {1,3,5,7,9,0,0,0,0}
		
		printArr(mas);

	}
	
	// сжатие массива (выбросить каждый второй элемент)
	public static int[] compressArr(int[] arr) {
		int j = 0;		
		
		for (int i = 2; i < arr.length; i = i + 2) {
			j = j + 1;
			arr[j] = arr[i];
			
			if (i - 1 > j) {
				arr[i-1] = 0;
			}
			
			arr[i] = 0;
		}
		
		if (arr.length > 2) {
			arr[(arr.length / 2) + 1] = 0;
		} else if (arr.length == 2) {
			arr[1] = 0;
		}
									
		return arr;
	}
	
	public static void printArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%3d]", arr[i]);
		}
	}

}
