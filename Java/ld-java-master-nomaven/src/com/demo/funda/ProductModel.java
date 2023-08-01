package com.demo.funda;

//Model
 class ProductModel {
//    Property
//    read, read/write, write
    //read getter
    private String productId = "LEP001";

    //read
    private String productName = "Java";

    @Override
    public String toString() {
        return "ProductModel{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", expired=" + expired +
                '}';
    }

    public void setPrice(float price) {
        if(price < 1 || price > 101)
        {
            System.out.println("Price not in range!");
            return;
        }
        this.price = price;
    }

    //read-write //getter / setter
    private float price = 50.50f;
//write //setter
    private boolean expired = false;

    //conventions
    public String getProductId(){
        return productId.substring(2) ;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String pProductName) {
        productName = pProductName;
    }

}

