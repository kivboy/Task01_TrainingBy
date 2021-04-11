package by.home.fraction.presentation;

import by.home.fraction.entity.Fraction;

public class FractionView {
	// печать дроби
	public String print(Fraction f) {
		return f.getNumerator() + "/" + f.getDenominator();
	};
	
	// печать суммы дробей
	public void printSum(Fraction f1, Fraction f2, Fraction f3) {		
		System.out.println(this.print(f1) + " + " + this.print(f2) + " = " + this.print(f3));
	}
	
	// печать разности дробей
	public void printSubstraction(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(this.print(f1) + " - " + this.print(f2) + " = " + this.print(f3));
	}

	// печать произведения дробей
	public void printMultiply(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(this.print(f1) + " * " + this.print(f2) + " = " + this.print(f3));
	}
	
	// печать деления дробей
	public void printDivide(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(this.print(f1) + " / " + this.print(f2) + " = " + this.print(f3));
	}
}
