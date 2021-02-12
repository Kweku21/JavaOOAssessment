package com.products.kinds;

import com.products.ProductPricingService;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FutureTest {

    @InjectMocks
    Future futureProduct = new Future("1");

    @Mock
    ProductPricingService productPricingService;


    @org.junit.Test
    public void price() {

        when(productPricingService.price("fixed","Business-in-a-Box",2,2021)).thenReturn(200.0);

        futureProduct.setProductPricingService(productPricingService);
        futureProduct.setExchange("fixed");
        futureProduct.setContractCode("Business-in-a-Box");
        futureProduct.setContractMonth(2);
        futureProduct.setContractYear(2021);

        double expected = 200.0;

//        System.out.println(futureProduct.getProductPricingService().price());

        assertEquals( expected,futureProduct.price(),0.1);


    }
}