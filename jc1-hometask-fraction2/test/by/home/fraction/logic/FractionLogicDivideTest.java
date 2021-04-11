package by.home.fraction.logic;

import org.junit.Assert;
import org.junit.Test;

import by.home.fraction.entity.Fraction;

public class FractionLogicDivideTest {

	@Test
	public void calcFractionDivideT01() {
		Fraction actualResult;
		Fraction f1 = new Fraction(5, 8); 
		Fraction f2 = new Fraction(3, 7);
		Fraction expectedResult = new Fraction(35, 24);

		FractionLogic logic = new FractionLogic();
	
		// деление дробей
		actualResult = logic.divide(f1, f2);		
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
