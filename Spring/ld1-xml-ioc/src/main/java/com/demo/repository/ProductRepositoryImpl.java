package com.demo.repository;

import com.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements  ProductRepository{
    //Repository can connect to DB and return data.
    public List<Product> findAll() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product ("P01", "Man's Search For Meaning", 300));
        products.add(new Product ("P02", "Awaken the Giant Within", 500));
        return products;
    }
}