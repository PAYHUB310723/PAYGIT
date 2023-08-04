package com.demo;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;
import com.demo.repository.ProductRepositoryImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("SPRING SET UP!");
        ProductRepository productRepository = new ProductRepositoryImpl();

//        short syntax
        List<Product> productList =  productRepository.findAll();
        productList.forEach(product -> System.out.println(product));


//        shorter syntax using method reference
//        productList.forEach(System.out::println);
//        productRepository.findAll().forEach(System.out::println);
    }
}
