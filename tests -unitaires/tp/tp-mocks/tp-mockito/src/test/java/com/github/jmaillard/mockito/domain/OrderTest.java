package test.java.com.github.jmaillard.mockito.domain;

import java.math.BigDecimal;

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
	Product product1;
	
	@Mock
	Product product2;
	
	@Test
	public void should_order_price_expected_8_99_if_i_add_2_product_with_price_3_99_and_5() throws Exception {
		// GIVEN
		Mockito.when(product1.getPrice()).thenReturn(new BigDecimal("3.99"));
		Mockito.when(product2.getPrice()).thenReturn(new BigDecimal("5.00"));
		Order order = new Order(Lists.newArrayList(product1,product2));
		BigDecimal result_expected =  new BigDecimal("8.99");
		
		// WHEN
		BigDecimal ret = order.getTotalPrice();
		
		//THEN
		Assert.assertThat(ret, IsEqual.equalTo(result_expected));
	}
}
