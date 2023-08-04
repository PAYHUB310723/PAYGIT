package com.demo.service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    //Spring framework provides dependency throught constructor  (Constructor based DI)
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> findAllFromService() {
        //The service layer is dependent on the repository layer.
        return this.productRepository.findAllFromRepository();
    }
}
