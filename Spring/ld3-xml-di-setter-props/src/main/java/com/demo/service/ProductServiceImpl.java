package com.demo.service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private String location;
    private String domainName;

    private ProductRepository productRepository;

    //Spring framework provides dependency throught constructor  (Constructor based DI)
//    public ProductServiceImpl(ProductRepository productRepository){
//        System.out.println("CONSTRUCTOR BASED DI!");
//        this.productRepository = productRepository;
//    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    public void setLocation(String location) {
        System.out.println("Setting the location :)");
        this.location = location;
    }
    @Override
    public String getLocation() {
        return location;
    }

    public void setProductRepository(ProductRepository productRepository) {
        System.out.println("SETTER BASED DI!");
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllFromService() {
        //The service layer is dependent on the repository layer.
        return this.productRepository.findAllFromRepository();
    }
}
