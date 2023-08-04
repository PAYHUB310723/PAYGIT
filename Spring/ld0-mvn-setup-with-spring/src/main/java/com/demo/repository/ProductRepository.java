package com.demo.repository;

import com.demo.model.Product;
import java.util.List;

public interface ProductRepository {
    public List<Product> findAll();
}