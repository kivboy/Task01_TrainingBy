package by.home.fraction.logic;

import by.home.fraction.entity.Fraction;

import org.junit.Assert;
import org.junit.Test;

public class FractionLogicSubstructionTest {
	
	@Test
	public void calcFractionSubstructionT01() {
		Fraction actualResult;
		Fraction f1 = new Fraction(5, 8); 
		Fraction f2 = new Fraction(3, 7);
		Fraction expectedResult = new Fraction(11, 56);

		FractionLogic logic = new FractionLogic();
	
		// вычитание дробей
		actualResult = logic.subtraction(f1, f2);		
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
