package com.products.kinds;

import com.products.Product;
import com.products.ProductPricingService;

public class Future extends Product {

    private String exchange,contractCode;
    int contractMonth, contractYear;

    ProductPricingService productPricingService;


    public Future(String id) {
        super(id);
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public int getContractMonth() {
        return contractMonth;
    }

    public void setContractMonth(int contractMonth) {
        this.contractMonth = contractMonth;
    }

    public int getContractYear() {
        return contractYear;
    }

    public void setContractYear(int contractYear) {
        this.contractYear = contractYear;
    }

    public ProductPricingService getProductPricingService() {
        return productPricingService;
    }

    public void setProductPricingService(ProductPricingService productPricingService) {
        this.productPricingService = productPricingService;
    }

    public double price(){

        return productPricingService.price(exchange,contractCode,contractMonth,contractYear);

    }


//    public double getPrice(){
//        return price;
//    }


}
