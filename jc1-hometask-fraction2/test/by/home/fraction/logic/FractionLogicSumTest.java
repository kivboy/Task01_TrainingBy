package by.home.fraction.logic;

import by.home.fraction.entity.Fraction;

import org.junit.Assert;
import org.junit.Test;

public class FractionLogicSumTest {
	
	@Test
	public void calcFractionSumT01() {
		Fraction actualResult;
		Fraction f1 = new Fraction(5, 8); 
		Fraction f2 = new Fraction(3, 7);
		Fraction expectedResult = new Fraction(59, 56);

		FractionLogic logic = new FractionLogic();
	
		// сложение дробей
		actualResult = logic.sum(f1, f2);		
		
		Assert.assertEquals(expectedResult, actualResult);
	}	
}
