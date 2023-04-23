package in.sriniit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sriniit.binding.Product;

@Controller
public class ProductController {

	private static Logger logger = LoggerFactory.getLogger(ProductController.class);

	@GetMapping("/")
	public String displayForm(Model model) {
		logger.info("*** displayForm () method execution start ***");
		Product productObj = new Product();
		model.addAttribute("product", productObj);
		logger.info("*** displayForm () method execution end ***");
		return "index";
	}

	@PostMapping("/product")
	public String saveProduct(Product product, Model model) {
		logger.info("*** saveProduct () method execution start ***");
		System.out.println(product);
		model.addAttribute("msg", "Product Saved Successfully");
		logger.info("*** saveProduct () method execution end ***");
		return "success";
	}

	@GetMapping("/viewProducts")
	public String viewProducts(Model model) {
		logger.info("*** viewProducts () method execution start ***");
		int i = 10 / 0;
		logger.info("*** viewProducts () method execution end***");
		return "success";
	}

}
