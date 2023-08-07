package com.demo.repository;

import com.demo.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ProductRepositoryNewImpl implements  ProductRepository{
    //Repository can connect to DB and return data.
    List<Product> products =  new Vector<>();
    public List<Product> findAllFromRepository() {
        products.add(new Product ("P01", "Limiteless", 300));
        products.add(new Product ("P02", "Awaken the Giant Within", 500));
        applyDiscount();
        return products;
    }

    public  void applyDiscount(){
        products =  new Vector<>();
        products.add(new Product ("P01", "Limiteless", 300-20));
        products.add(new Product ("P02", "Awaken the Giant Within", 500-20));
    }
}