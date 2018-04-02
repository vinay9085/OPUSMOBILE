package hello.model;

import java.util.Map;

public class Product {
	int productId;
	String productName;
	String productDescription;
	Map relatedProducts;
	String productImage;
	String itemId;
	double price;
	int quantity;

	public Product() {/*
		this.productId;
		this.productName;
		this.productDescription;
		this.relatedProducts = null;
		this.productImage = "image";*/
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Map getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(Map relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}