package hello;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hello.model.Product;
import hello.service.LoginService;
import hello.service.ProductService;

@Controller
public class LoginController {

	@Autowired
	ProductService service;

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String greeting() {// model.addAttribute("name", name);
		return "login";
	}

	/*
	 * @GetMapping("/login") public String greeting(@RequestParam(name = "name",
	 * required = false, defaultValue = "World") String name, Model model) {
	 * model.addAttribute("name", name); return "login"; }
	 */
	@PostMapping(value = "/login")
	public String showWelcomePage(ModelMap model, @RequestParam String userId, @RequestParam String password) {
		boolean isValidUser = loginService.validateUser(userId, password);
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "loginError";
		} else {
			model.put("name", userId);
			model.put("password", password);
			LinkedHashMap<Integer, Product> products = service.getProducts();
			/*
			 * if (products == null || products.size() == 0) return "homeWithItems"; else {
			 */
			model.put("prodMap", products);
			return "homeWithItems";
			/* } */
		}

	}
}