package com.products.kinds;

import com.products.*;


public class Stock extends Product {

    private String exchange,ticker;

    ProductPricingService productPricingService;

    public Stock(String id) {
        super(id);
    }


    public double price(){

        return productPricingService.price(exchange,ticker);

    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public ProductPricingService getProductPricingService() {
        return productPricingService;
    }

    public void setProductPricingService(ProductPricingService productPricingService) {
        this.productPricingService = productPricingService;
    }
}
