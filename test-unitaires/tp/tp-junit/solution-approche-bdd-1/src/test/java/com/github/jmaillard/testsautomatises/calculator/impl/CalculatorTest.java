package test.java.com.github.jmaillard.testsautomatises.calculator.impl;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.github.jmaillard.testsautomatises.calculator.impl.Calculator;

public class CalculatorTest {

	@Test
	public void  should_i_get_five_if_i_add_two_to_three(){
		Assert.assertEquals(5,(new Calculator()).sum(2, 3));
	}

	@Test
	public void should_i_get_minus_one_if_i_add_two_to_minus_three(){
		Assert.assertEquals(-1,(new Calculator()).sum(2, -3));
	}

	@Test
	public void should_i_get_minus_one_if_two_subtract_by_three(){
		Assert.assertEquals(-1,(new Calculator()).minus(2, 3));
	}

	@Test
	public void should_i_get_minus_five_if_two_subtract_by_minus_three(){
		Assert.assertEquals(5,(new Calculator()).minus(2, -3));
	}

	@Test
	public void should_i_get_five_if_i_divide_ten_by_two(){
		Assert.assertEquals(5,(new Calculator()).divide(10, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void should_i_get_an_error_if_i_divide_ten_by_zero(){
		(new Calculator()).divide(10, 0);
	}

	@Test
	public void should_i_get_six_if_i_multiply_two_by_three(){
		Assert.assertEquals(6,(new Calculator()).multiply(2, 3));
	}

	@Test
	public void should_i_get_zero_if_i_multiply_two_by_zero(){
		Assert.assertEquals(0,(new Calculator()).multiply(2, 0));
	}

}
