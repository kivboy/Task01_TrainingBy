package by.home.fraction.logic;

import org.junit.Assert;
import org.junit.Test;

import by.home.fraction.entity.Fraction;

public class FractionLogicMultiplyTest {
	
	@Test
	public void calcFractionMultiplyT01() {
		Fraction actualResult;
		Fraction f1 = new Fraction(5, 8); 
		Fraction f2 = new Fraction(3, 7);
		Fraction expectedResult = new Fraction(15, 56);

		FractionLogic logic = new FractionLogic();
	
		// умножение дробей
		actualResult = logic.multiply(f1, f2);		
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
