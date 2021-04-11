package by.home.fraction.main;

import by.home.fraction.entity.Fraction;
import by.home.fraction.logic.FractionLogic;
import by.home.fraction.presentation.FractionView;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fraction f3;
		//Fraction f1 = new Fraction(5, 8);
		//Fraction f2 = new Fraction(3, 7);

		Fraction f1;
		Fraction f2;
		
		// инициализируем 1-ю дробь
		f1 = inputFraction(1);

		// инициализируем 1-ю дробь
		f2 = inputFraction(2);

		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();

		// сложение дробей
		f3 = logic.sum(f1, f2);
		// вывод сложения
		view.printSum(f1, f2, f3);

		// вычитание дробей
		f3 = logic.subtraction(f1, f2);
		// вывод вычитания
		view.printSubstraction(f1, f2, f3);

		// умножение дробей
		f3 = logic.multiply(f1, f2);
		// вывод умножения
		view.printMultiply(f1, f2, f3);

		// деление дробей
		f3 = logic.divide(f1, f2);
		// вывод деления
		view.printDivide(f1, f2, f3);

	}

	// Ввод числа с консоли
	public static int inputInt(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message + " > ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(message + " > ");

		}
		x = sc.nextInt();

		return x;
	}

	// Ввод с консоли значения n-й дроби
	public static Fraction inputFraction(int n) {
		int newNumerator = 0;
		int newDenominator = 0;

		do {
			newNumerator = inputInt("Введите числитель " + n + "-й дроби");

			if (newNumerator <= 0) {
				System.out.println("Ошибка! Значение должно быть больше 0!");
			}
		} while (newNumerator <= 0);

		do {
			newDenominator = inputInt("Введите знаменатель " + n + "-й дроби");
			if (newDenominator <= 0) {
				System.out.println("Ошибка! Значение должно быть больше 0!");
			}
		} while (newDenominator <= 0);

		Fraction result = new Fraction(newNumerator, newDenominator);

		return result;
	}
	/*
	 * // печать дроби public static String printFraction(Fraction fr1, boolean
	 * showMix) {
	 * 
	 * String result = ""; int wholePart; int newNumerator;
	 * 
	 * // отображать составные дроби if (showMix == true) { // Приводим к формату
	 * составной дроби
	 * 
	 * if (fr1.numerator == 0) { // если числитель равен 0, то выводим вместо дроби
	 * 0 result = String.valueOf(fr1.numerator);
	 * 
	 * } else if (fr1.numerator >= fr1.denominator) { // если числитель больше
	 * знаменателя то определяем целое число
	 * 
	 * wholePart = fr1.numerator / fr1.denominator; newNumerator = fr1.numerator %
	 * fr1.denominator;
	 * 
	 * if (newNumerator != 0) { result = wholePart + "(" + newNumerator + "/" +
	 * fr1.denominator + ")"; } else { result = String.valueOf(wholePart); }
	 * 
	 * } else { // Числитель меньше знаменателя
	 * 
	 * result = fr1.numerator + "/" + fr1.denominator; }
	 * 
	 * } else { // Выводим данные без изменений
	 * 
	 * result = fr1.numerator + "/" + fr1.denominator; }
	 * 
	 * return result; }
	 */

}
