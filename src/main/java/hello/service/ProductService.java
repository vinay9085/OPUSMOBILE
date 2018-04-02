package hello.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import hello.model.Product;

@Service
public class ProductService {
	public static int incrementedId = 1;
	
	
	//List<Product> products = new ArrayList<Product>();
	LinkedHashMap<Integer, Product> prodMap =new LinkedHashMap<Integer, Product>();

	public LinkedHashMap<Integer, Product> getProducts() {
		return prodMap;
	}

	public static int getIncrementedId() {
		return incrementedId++;
	}

	public static void setIncrementedId(int incrementedId) {
		ProductService.incrementedId = incrementedId;
	}

	public void addProduct(Product product) {
		prodMap.put(product.getProductId(), product);
	}

	public LinkedHashMap<Integer, Product> getProdMap() {
		return prodMap;
	}

	public void setProdMap(LinkedHashMap<Integer, Product> prodMap) {
		this.prodMap = prodMap;
	}

	public void setProducts(List<Product> products) {
		//this.products = products;
	}

}
