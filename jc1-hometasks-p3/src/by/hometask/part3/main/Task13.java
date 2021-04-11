package by.hometask.part3.main;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 * @author Ilya
 *
 */
public class Task13 {

	public static void main(String[] args) {
		int[][] mas;

		mas = generateMatrix(5);

		printMatrix(mas);
	}

	public static int[][] generateMatrix(int size) {
		int[][] resultMatrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j = j + 2) {
				resultMatrix[j][i] = i + 1; 
			}
			
			for (int j = 1; j < size; j = j + 2) {
				resultMatrix[j][i] = size - i; 
			}
		}

		return resultMatrix;
	}

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("[%3d]", matrix[i][j]);
			}
			System.out.println();
		}

	}
}
