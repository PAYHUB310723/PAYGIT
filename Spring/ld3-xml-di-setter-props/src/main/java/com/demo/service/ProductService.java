package com.demo.service;

import com.demo.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAllFromService();
    public String getLocation();
    public String getDomainName();
}
