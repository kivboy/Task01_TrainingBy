package by.hometask.part2.main;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 * 
 * @author Ilya
 *
 */

public class Task19 {

	public static void main(String[] args) {
		int[] mas = {5, 3, 6 , 3, 4, 3};
		
		System.out.printf("Наиболее частое чиcло: %d", findFreqNumber(mas));

	}
	
	// поиск наиболее часто встречающегося числа. 
	// Если таких чисел несколько, то вернуть наименьшее из них.
	public static int findFreqNumber(int[] arr) {
		int freqNumber = arr[0];
		int freqCount = 1;
				
		for (int i = 0; i < arr.length; i++) {
			
			int tmpCount = 1;
			
			for (int j = 0; j < arr.length; j++) {
				if ((i != j) && (arr[i] == arr[j])) {
					tmpCount++;
				}
			}
			
			if (tmpCount > freqCount) {
				freqNumber = arr[i];
				freqCount = tmpCount;
			} else if ((tmpCount == freqCount) && (freqNumber > arr[i])) {
				freqNumber = arr[i];
			}
		}
		
		return freqNumber;
	}
}
