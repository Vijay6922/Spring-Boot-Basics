package Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jdbc.products;

@RestController
//@RequestMapping("/controlProducts")
public class controlProducts {

	@Autowired
	private productsRepo pr;

	ArrayList<products1> products = new ArrayList<>();

	public controlProducts() {
		products.add(new products1(1, "iphone 15 pro", 10.00, 1, "GOOD", "ios"));
		products.add(new products1(2, "SAMSUNG FOLD", 50.00, 2, "SUPER", "Andriod"));
		products.add(new products1(3, "OnePlus 10", 8.00, 4, "OK", "Andriod"));
	}

	@GetMapping("/products")
	public List<products1> getAllProducts() {
		System.out.println("ok");
		return products;

	}

	@PostMapping("/products/add")
	public products1 addProducts(@RequestBody products1 newProducts) {
		products.add(newProducts);
		return newProducts;
	}
	@GetMapping("/products/{prodid}")
	public products1 getOneProduct(@PathVariable("prodid") int prodid) {
		Optional<products1> optProduct = pr.findById(prodid);
		if (optProduct.isPresent())
			return optProduct.get();
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product ID Not Found...!");
	}


}
