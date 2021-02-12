package com.services;

import com.exceptions.ProductAlreadyRegisteredException;
import com.products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MontrealTradedProductService implements MontrealTradedProducts{

    List<Product> productList = new ArrayList<>();
    Map<Product,Integer> productQuantity = new HashMap<>();
    Map<Product, Integer> productQuantityForDay = new HashMap<>();


    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void trade(Product product, int quantity) {
        if (productList.contains(product)){

            productQuantity.put(product,quantity);

        }else{
            System.out.println("Product has not been registered");
        }

    }

    public Map<Product, Integer> getProductQuantity() {

        return productQuantity;
    }

    public void addProductForDay(Product product,int quantity){

        if (productList.contains(product)){

            productQuantityForDay.put(product,quantity);

        }else{
            System.out.println("Product has not been registered");
        }
    }

    public Map<Product, Integer> getProductQuantityForDay() {
        return productQuantityForDay;
    }

    @Override
    public int totalTradeQuantityForDay() {

        int total = 0;

        for(Map.Entry<Product,Integer> entry : productQuantityForDay.entrySet()){

            total += entry.getValue();

        }

        return total;

    }

    @Override
    public double totalValueOfDaysTradedProducts() {

        return productQuantityForDay.size();

    }
}
