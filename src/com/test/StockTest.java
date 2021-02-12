package com.test;

import com.products.ProductPricingService;
import com.products.kinds.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StockTest {

    @InjectMocks
    Stock stock = new Stock("2");

    @Mock
    ProductPricingService productPricingService;


    @Test
    public void price() {

        when(productPricingService.price("fixed","Business-in-a-Box")).thenReturn(1000.0);

        stock.setProductPricingService(productPricingService);
        stock.setExchange("fixed");
        stock.setTicker("Business-in-a-Box");

        double expected = 1000.0;

        assertEquals(expected,stock.price(),0.1);
    }
}