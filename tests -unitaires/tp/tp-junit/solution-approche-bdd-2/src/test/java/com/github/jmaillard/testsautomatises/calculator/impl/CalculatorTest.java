package test.java.com.github.jmaillard.testsautomatises.calculator.impl;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.github.jmaillard.testsautomatises.calculator.ICalculator;
import main.java.com.github.jmaillard.testsautomatises.calculator.impl.Calculator;

public class CalculatorTest {
	@Test
	public void  should_i_get_five_if_i_add_two_to_three(){
//		// GIVEN
//		ICalculator calculator = new Calculator();
//
//		// WHEN
//		int resultAddTwoToThree = calculator.sum(2, 3);

		// THEN
		Assert.assertEquals(5,(new Calculator()).sum(2, 3));
	}

	@Test
	public void should_i_get_minus_one_if_i_add_two_to_minus_three(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultAddTwoToMinusThree = calculator.sum(2, -3);

		// THEN
		Assert.assertEquals(-1,resultAddTwoToMinusThree);
	}

	@Test
	public void should_i_get_minus_one_if_two_subtract_by_three(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultTwoSubtractByThree =calculator.minus(2, 3);

		// THEN
			Assert.assertEquals(-1,resultTwoSubtractByThree);
	}

	@Test
	public void should_i_get_minus_five_if_two_subtract_by_minus_three(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultTwoSubtractByMinusThree = calculator.minus(2, -3);

		// THEN
		Assert.assertEquals(5,resultTwoSubtractByMinusThree);
	}

	@Test
	public void should_i_get_five_if_i_divide_ten_by_two(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultDivideTenByTwo = calculator.divide(10, 2);

		// THEN
		Assert.assertEquals(5,resultDivideTenByTwo);
	}

	@Test(expected = ArithmeticException.class)
	public void should_i_get_an_error_if_i_divide_ten_by_zero(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		calculator.divide(10, 0);

		// THEN
	}

	@Test
	public void should_i_get_six_if_i_multiply_two_by_three(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultMultiplyTwoByThree = calculator.multiply(2, 3);

		// THEN
		Assert.assertEquals(6,resultMultiplyTwoByThree);
	}

	@Test
	public void should_i_get_zero_if_i_multiply_two_by_zero(){
		// GIVEN
		ICalculator calculator = new Calculator();

		// WHEN
		int resultMultiplyTwoByZero = calculator.multiply(2, 0);

		// THEN
		Assert.assertEquals(0,resultMultiplyTwoByZero);
	}
}
