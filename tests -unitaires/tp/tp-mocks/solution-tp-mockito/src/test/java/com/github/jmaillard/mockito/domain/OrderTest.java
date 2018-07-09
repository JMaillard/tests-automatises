package test.java.com.github.jmaillard.mockito.domain;


import java.math.BigDecimal;
import java.util.Locale;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.collect.Lists;

import main.java.com.github.jmaillard.mockito.domain.Order;
import main.java.com.github.jmaillard.mockito.domain.Product;

@RunWith(MockitoJUnitRunner.class)
public class OrderTest {

	@Mock
	private Product product1;
	@Mock
	private Product product2;

	@Test
	public void should_have_a_total_price_equal_to_8_99_when_i_have_first_product_cost_3_99_and_second_5_00() throws Exception {
		Order order = new Order(Lists.newArrayList(product1, product2));

		// GIVEN
		Mockito.when(product1.getPrice()).thenReturn(new BigDecimal("3.99"));
		Mockito.when(product2.getPrice()).thenReturn(new BigDecimal("5.00"));
		// WHEN
		BigDecimal resultTotalPrice = order.getTotalPrice();

		// THEN
		Assert.assertThat(resultTotalPrice, IsEqual.equalTo(new BigDecimal("8.99")));
	}	

	@Test
	public void should_format_total_price_to_10_00_euros_string() throws Exception {
		Order order = new Order();
		
		//.spy(new Order(null));

		// GIVEN
		Mockito.when(order.getTotalPrice()).thenReturn(BigDecimal.TEN);

		// WHEN
		String price = order.formatTotalPrice(Locale.FRANCE);

		// THEN
		Assert.assertThat(price, IsEqual.equalTo("10,00 €"));
		Mockito.verify(order, Mockito.times(1)).getTotalPrice();
	}

}
