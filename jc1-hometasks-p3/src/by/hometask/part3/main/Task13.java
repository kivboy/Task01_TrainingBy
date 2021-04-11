package by.hometask.part3.main;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 * @author Ilya
 *
 */

public class Task13 {

	public static void main(String[] args) {
		int[][] mas;  // ссылка на массив массивов
		int size = 6; // размер матрицы
		
		// создаём матрицу размера 
		mas = generateMatrix(size);

		// выводим результат на экран
		printMatrix(mas);
	}

	// генерация требуемой матрицы 
	public static int[][] generateMatrix(int size) {
		int[][] resultMatrix = new int[size][size];

		for (int j = 0; j < size; j++) {
			
			// нечётные строки
			for (int i = 0; i < size; i = i + 2) {
				resultMatrix[i][j] = j + 1; 
			}
			
			// чётные строки
			for (int i = 1; i < size; i = i + 2) {
				resultMatrix[i][j] = size - j; 
			}
		}

		return resultMatrix;
	}

	// печать матрицы на экран
	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("[%3d]", matrix[i][j]);
			}
			System.out.println();
		}

	}
}
