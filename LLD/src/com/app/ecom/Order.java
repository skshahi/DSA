package com.app.ecom;

import java.util.List;

public class Order {
	
	private String orderId;
	private List<Product> products;
	
	private Order(OrderBuilder builder)
	{
		this.orderId=builder.orderId;
		this.products=builder.products;
		
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", products=" + products + "]";
	}


	public static class OrderBuilder{
		private final String orderId;
		private final  List<Product> products;
		public OrderBuilder(String orderId, List<Product> products) {
			super();
			this.orderId = orderId;
			this.products = products;
		}
		
		public Order build()
		{
			return new Order(this);
		}
		
		
		
		
	}
	

}
