package com;

import com.exceptions.ProductAlreadyRegisteredException;
import com.products.kinds.Future;
import com.products.kinds.Stock;
import com.services.MontrealTradedProductService;

public class Main {

    public static void main(String[] args) {

        MontrealTradedProductService montrealTradedProductService = new MontrealTradedProductService();

        Future futureProduct = new Future("1");
        Stock stock = new Stock("2");


        try {

            montrealTradedProductService.addNewProduct(futureProduct);

        }catch (ProductAlreadyRegisteredException e){

            System.out.println(e.getMessage());

        }

        System.out.println(montrealTradedProductService.getProductList().size());
	// write your code here
    }
}
