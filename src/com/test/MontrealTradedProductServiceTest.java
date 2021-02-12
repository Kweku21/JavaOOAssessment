package com.test;

import com.exceptions.ProductAlreadyRegisteredException;
import com.products.kinds.Future;
import com.products.kinds.Stock;
import com.services.MontrealTradedProductService;
import org.junit.Test;

import static org.junit.Assert.*;

public class MontrealTradedProductServiceTest {


    @Test
    public void addNewProduct() {

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");


        try {

            montrealTradedProductService.addNewProduct(futureProduct);
            montrealTradedProductService.addNewProduct(stock);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }

        assertEquals(2,montrealTradedProductService.getProductList().size());
    }

    @Test
    public void trade() {

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");

        try {

            montrealTradedProductService.addNewProduct(futureProduct);
            montrealTradedProductService.addNewProduct(stock);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }


        montrealTradedProductService.trade(futureProduct,50);
        montrealTradedProductService.trade(stock,25);


       assertEquals(true,montrealTradedProductService.getProductQuantity().containsKey(futureProduct));

//        assertEquals(stock,montrealTradedProductService.getProductQuantity().get(futureProduct));

    }

    @Test
    public void addProductForDay(){

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");

        try {

            montrealTradedProductService.addNewProduct(futureProduct);
            montrealTradedProductService.addNewProduct(stock);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }


        montrealTradedProductService.addProductForDay(futureProduct,50);
        montrealTradedProductService.addProductForDay(stock,25);

        assertEquals(true,montrealTradedProductService.getProductQuantityForDay().containsKey(futureProduct));

    }

    @Test
    public void  totalTradeQuantityForDay(){

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");

        try {

            montrealTradedProductService.addNewProduct(futureProduct);
            montrealTradedProductService.addNewProduct(stock);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }


        montrealTradedProductService.addProductForDay(futureProduct,50);
        montrealTradedProductService.addProductForDay(stock,25);

        assertEquals(75,montrealTradedProductService.totalTradeQuantityForDay());

    }

    @Test
    public void  totalValueOfDaysTradedProducts(){

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");

        try {

            montrealTradedProductService.addNewProduct(futureProduct);
            montrealTradedProductService.addNewProduct(stock);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }


        montrealTradedProductService.addProductForDay(futureProduct,50);
        montrealTradedProductService.addProductForDay(stock,25);

        assertEquals(2,montrealTradedProductService.getProductQuantityForDay().size());

    }


}