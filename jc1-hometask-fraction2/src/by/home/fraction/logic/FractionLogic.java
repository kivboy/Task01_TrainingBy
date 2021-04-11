package by.home.fraction.logic;

import by.home.fraction.entity.Fraction;

public class FractionLogic {
	// сложение дробей
	public Fraction sum(Fraction fr1, Fraction fr2) {
		int newNumerator;
		int newDenominator;

		newNumerator = fr1.getNumerator() * fr2.getDenominator() + fr2.getNumerator() * fr1.getDenominator();
		newDenominator = fr1.getDenominator() * fr2.getDenominator();

		Fraction result = new Fraction(newNumerator, newDenominator);

		// сокращаем дробь
		this.reduce(result);
				
		return result;		
	}

	// Вычитание дробей
	public Fraction subtraction(Fraction fr1, Fraction fr2) {
		int newNumerator;
		int newDenominator;

		newNumerator = fr1.getNumerator() * fr2.getDenominator() - fr2.getNumerator() * fr1.getDenominator();
		newDenominator = fr1.getDenominator() * fr2.getDenominator();

		Fraction result = new Fraction(newNumerator, newDenominator);
		
		// сокращаем дробь
		this.reduce(result);
		
		return result;		
	}

	// Умножение дробей
	public Fraction multiply(Fraction fr1, Fraction fr2) {
		int newNumerator;
		int newDenominator;

		newNumerator = fr1.getNumerator() * fr2.getNumerator();
		newDenominator = fr1.getDenominator() * fr2.getDenominator();

		Fraction result = new Fraction(newNumerator, newDenominator);

		// сокращаем дробь
		this.reduce(result);
		
		return result;
	}

	// Деление дробей
	public Fraction divide(Fraction fr1, Fraction fr2) {
		int newNumerator;
		int newDenominator;

		newNumerator = fr1.getNumerator() * fr2.getDenominator();
		newDenominator = fr1.getDenominator() * fr2.getNumerator();

		Fraction result = new Fraction(newNumerator, newDenominator);
		
		// сокращаем дробь
		this.reduce(result);
		
		return result;
	}
	
	// Сокращение дроби
	public void reduce(Fraction fr1) {

		int nod;
		
		// Ищем наибольший общий делитель. Начинаем с большего из 2-х. 
		if (fr1.getNumerator() > fr1.getDenominator()) {
			nod = fr1.getDenominator();
		} else {
			nod = fr1.getNumerator();
		}

		while (!((fr1.getNumerator() % nod == 0) && (fr1.getDenominator() % nod == 0))) {
			nod--;
		}

		fr1.setNumerator(fr1.getNumerator() / nod);
		fr1.setDenominator(fr1.getDenominator() / nod);
		
	}
}
