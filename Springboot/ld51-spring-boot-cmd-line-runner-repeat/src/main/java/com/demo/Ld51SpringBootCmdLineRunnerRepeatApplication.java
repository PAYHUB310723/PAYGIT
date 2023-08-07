package com.demo;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;
import com.demo.repository.ProductRepositoryNewImpl;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ld51SpringBootCmdLineRunnerRepeatApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ld51SpringBootCmdLineRunnerRepeatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Acess the bean
//		ProductService productService = (ProductService) classPathXmlApplicationContext.getBean("productService");
		getProductService().findAllFromService().forEach(System.out::println);
	}

// Bean productRepository,productService. getters getProductRepository, getProductService
	//IOC
	@Bean
	public ProductRepository getProductRepository() {
		return new ProductRepositoryNewImpl();
	}
	//IOC & DI
	@Bean
	public ProductService getProductService(){
		return new ProductServiceImpl(getProductRepository());
	}
//    <bean id="productRepository" class="com.demo.repository.ProductRepositoryImpl"/>
//<!--  The ProductService bean is dependent on ProductRepository  -->
//<!--  constructor based DI  -->
//<!--    public ProductServiceImpl(ProductRepository productRepository){-->
//<!--    this.productRepository = productRepository;-->
//<!--    }-->
//    <bean id="productService" class="com.demo.service.ProductServiceImpl">
//<!--        <constructor-arg index="0" ref="productRepository"/>-->
//        <constructor-arg  ref="productRepository"/>
//    </bean>
}
