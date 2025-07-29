package com.app.ecom;

import java.util.Arrays;
import java.util.List;

public class EcommerceMain {

	public static void main(String[] args) {
		
		//create the user database -singleton
		
		UserDatabase userDatabase=UserDatabase.getIntance();
		System.out.println(userDatabase);
		
		//get product info -- factory design pattern
		ProductFactory productFactory=new ProductFactory();
		Product electronicsProduct = productFactory.createProduct("electronics");
		electronicsProduct.displayInfo();
		
		Product clothingProduct = productFactory.createProduct("clothing");
		clothingProduct.displayInfo();
		
		
		/// user account object -- builder design pattern
		///
		
		UserAccount.UserAccountBuilder userBuilder=
				new UserAccount.UserAccountBuilder("sonu","kumar");
		UserAccount userAccount = userBuilder.build();
		System.out.println(userAccount);
		
		
		///build  order 
		///
		
		List<Product> products=Arrays.asList(electronicsProduct,clothingProduct);
		
		Order.OrderBuilder orderBuilder=new Order.OrderBuilder("order01", products);
		
		Order order = orderBuilder.build();
		System.out.println(order);
		
		
		
		

	}

}
