package hello;

import java.util.LinkedHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Logger;
//import org.apache.juli.logging.LogFactory;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.model.Product;
import hello.service.ProductService;

@Controller

public class ProductController {
	Log log = LogFactory.getLog(ProductController.class);

	@Autowired
	ProductService service;

	@GetMapping(value = "/quickadd")
	public String showAdd(ModelMap model) {
		return "addItem";
	}

	@GetMapping(value = "/home")
	public String getHome(ModelMap model) {
		log.info("getHome method starts here");
		try {
			model.put("prodMap", service.getProdMap());
			return "homeWithItems";
		} catch (Exception e) {
			log.error("Error in getHome : " + e);
			return "error";
		}
	}

	@PostMapping(value = "/add")
	public String addProduct(ModelMap model, @RequestParam String itemId, @RequestParam String productName,
			@RequestParam String productDescription, @RequestParam String productImage, @RequestParam double price,
			@RequestParam int quantity) {
		log.info("addProduct method starts here");
		try {
			Product product = new Product();
			product.setProductId(service.getIncrementedId());
			product.setProductName(productName);
			product.setProductDescription(productDescription);
			product.setProductImage(productImage);
			product.setItemId(itemId);
			product.setPrice(price);
			product.setQuantity(quantity);
			service.addProduct(product);
			model.put("prodMap", service.getProducts());
			log.info("Product added successfuly for id : " + product.getProductId());
			return "homeWithItems";
		} catch (Exception e) {
			log.error("Exception in addProduct : " + e);
			return "error";
		}
	}

	@GetMapping(value = "/delete")
	public String deleteProduct(ModelMap model, @RequestParam int productId) {
		try {
			LinkedHashMap<Integer, Product> products = service.getProducts();
			products.remove(productId);
			model.put("prodMap", products);
			log.info("Product deleted successfully");
			return "deleteSuccess";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping(value = "/edit")
	public String editProduct(ModelMap model, @RequestParam int productId) {
		try {
			LinkedHashMap<Integer, Product> products = service.getProducts();
			// products.remove(Integer.parseInt(productId)-1);
			Product product = products.get(productId);
			model.put("prEd", product);
			log.info("Product edited successfully");
			return "editItem";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping(value = "/update")
	public String updateProduct(ModelMap model, @RequestParam int productId, @RequestParam String itemId,
			@RequestParam String productName, @RequestParam String productDescription,
			@RequestParam String productImage, @RequestParam double price, @RequestParam int quantity) {
		try {
			LinkedHashMap<Integer, Product> products = service.getProducts();
			Product product = products.get(productId);
			product.setProductName(productName);
			product.setProductDescription(productDescription);
			product.setProductImage(productImage);
			product.setItemId(itemId);
			product.setPrice(price);
			product.setQuantity(quantity);
			model.put("prodMap", products);
			return "homeWithItems";
		} catch (Exception e) {
			return "error";
		}
	}
}