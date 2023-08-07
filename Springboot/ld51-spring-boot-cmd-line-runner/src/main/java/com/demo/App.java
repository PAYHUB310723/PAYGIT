//package com.demo;
//
//import com.demo.model.Product;
//import com.demo.repository.ProductRepository;
//import com.demo.repository.ProductRepositoryImpl;
//import com.demo.service.ProductService;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
//public class App
//{
//    public static void main( String[] args )
//    {
////        noSpring();
////        withSpringIOC();
//        //        Load the IOC container
//        System.out.println("Spring IOC Container");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
////        Acess the bean
//        ProductService productService = (ProductService) classPathXmlApplicationContext.getBean("productService");
//        List<Product> productList =  productService.findAllFromService();
//        productList.forEach(product -> System.out.println(product));
//    }
//
//    private static void withSpringIOC() {
//        //        Load the IOC container
//        System.out.println("Spring IOC Container");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
////        Acess the bean
//        ProductRepository productRepository = (ProductRepository) classPathXmlApplicationContext.getBean("productRepository");
//        List<Product> productList =  productRepository.findAllFromRepository();
//        productList.forEach(product -> System.out.println(product));
//    }
//
//    private static void noSpring() {
//        System.out.println("SPRING IOC!");
//        ProductRepository productRepository = new ProductRepositoryImpl();
//
//
////        short syntax
//        List<Product> productList =  productRepository.findAllFromRepository();
//        productList.forEach(product -> System.out.println(product));
//
//
////        shorter syntax using method reference
////        productList.forEach(System.out::println);
////        productRepository.findAll().forEach(System.out::println);
//    }
//}
