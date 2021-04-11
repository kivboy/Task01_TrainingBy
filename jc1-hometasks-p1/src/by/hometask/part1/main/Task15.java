package by.hometask.part1.main;

/** 
 * 
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
 * шагом h. Результат представить в виде таблицы, первый столбец которой – значения
 * аргумента, второй - соответствующие значения функции.
 * 
 * @author Ilya Krachkovsky
 *
 */

public class Task15 {

	public static void main(String[] args) {
		double a = -3.2;
		double b = 4.5;
		double h = 0.3;
		
		// на всякий случай делаем проверку что 1-е число меньще второго
		if (a > b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		
		// шапка
		System.out.printf("%6s |%7s |\n","x","F(x)");
		System.out.println("-----------------");
		
		// вывод таблицы
		for (double x = a; x < b; x = x + h) {
			System.out.printf("%6.2f | %6.2f |\n", x, function(x));
		}
		
		// выводим значение на конце отрезка
		System.out.printf("%6.2f | %6.2f |\n", b, function(b));
		System.out.println("-----------------");
	}
	
	// функция вычисления значения для таблицы
	public static double function(double x) {
		return 2 * Math.tan(x / 2) + 1;		
	}

}
