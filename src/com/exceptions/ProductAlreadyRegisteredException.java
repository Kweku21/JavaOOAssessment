package com.exceptions;

public class ProductAlreadyRegisteredException extends Exception{

    public ProductAlreadyRegisteredException() {
        super("Product Already exist");
    }
}
