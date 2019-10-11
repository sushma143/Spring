package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbMainOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> product=productService.findAllProducts();
//		for(Product p:product)
//		{	System.out.println(p);}
//		
//		Product p1=productService.findProductById(1001);
//		if(p1!=null)
//		{
//			p1.setPrice(507);
//			productService.updateProduct(p1);
//		}
//		else 
//		{
//			System.out.println("No such Product found");
//		}
		//System.out.println(p1);
		//Product p2=new Product(1020, "Headphones"," boat", 500);
		//productService.addProduct(p2);
		for(Product p:product)
		{	System.out.println(p);}
		
		Product p1=productService.findProductById(1020);
		if(p1!=null)
		{
			
			productService.removeProduct(p1);
		}
		else 
		{
			System.out.println("No such Product found");
		}
		
		

	}

}
