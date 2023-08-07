package com.demo.model;

public class Product
{
    private String productId;
    private String productName;
    private float price;
    public Product(String productId, String productName, float price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

}
