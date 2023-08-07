//package com.demo;
//
//import com.demo.model.Product;
//import com.demo.repository.ProductRepository;
//import com.demo.repository.ProductRepositoryImpl;
//import com.demo.service.ProductService;
//import com.demo.service.ProductServiceImpl;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.Arrays;
//import java.util.List;
//
//@SpringBootApplication
//public class Ld51SpringBootCmdLineRunnerApplication implements CommandLineRunner {
//    public static void main(String[] args) {
//
////        System.out.println("Standalone Java App!");
//        SpringApplication.run(Ld51SpringBootCmdLineRunnerApplication.class, args);
//        //        //        Load the IOC container
////        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
////        Acess the bean
////        ProductService productService = getProductService();
////        List<Product> productList =  productService.findAllFromService();
////        productList.forEach(product -> System.out.println(product));
//
////COMPACT SYNTAX
////        getProductService().findAllFromService().forEach(product -> System.out.println(product));
//    }
//
////    <!--    ProductRepository productRepository = new ProductRepositoryImpl();-->
////<!--    define the beans-->
////    <bean id="productRepository" class="com.demo.repository.ProductRepositoryImpl"/>
////<!--  The ProductService bean is dependent on ProductRepository  -->
////<!--  constructor based DI  -->
////<!--    public ProductServiceImpl(ProductRepository productRepository){-->
////<!--    this.productRepository = productRepository;-->
////<!--    }-->
////    <bean id="productService" class="com.demo.service.ProductServiceImpl">
////<!--        <constructor-arg index="0" ref="productRepository"/>-->
////        <constructor-arg  ref="productRepository"/>
////    </bean>
//
//    @Bean
//    public static ProductRepository getProductRepository(){
//        return new ProductRepositoryImpl();
//    }
//    @Bean
//    public static ProductService getProductService(){
////        CONSTRUCTOR-BASED DEPENDENCY INJECTION
//        return new ProductServiceImpl(getProductRepository());
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Spring IOC Container");
//        Arrays.asList(args).forEach(System.out::println);
//        System.out.println("CommandLineRunner... run()....");
//        ProductService productService = getProductService();
//        List<Product> productList =  productService.findAllFromService();
//        productList.forEach(product -> System.out.println(product));
//    }
//}
