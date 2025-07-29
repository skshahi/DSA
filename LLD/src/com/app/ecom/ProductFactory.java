package com.app.ecom;

/**
 * should have the control to and logic to create product  object
*/
public class ProductFactory {
	
	public Product createProduct(String category)
	{
		switch(category.toLowerCase())
		{
		case "electronics":
			return new ElectronicsProduct();
		case "clothing":
			return new ClothingProduct();
		default:
			throw new IllegalArgumentException("Invalid category asked:"+category);
		}
	}

}
