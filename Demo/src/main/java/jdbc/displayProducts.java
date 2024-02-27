package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component
//@SpringBootApplication

public class displayProducts implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void showAveragePrice() {
		Double average = jdbcTemplate.queryForObject("select avg(price)as avg from products", Double.class);
		System.out.println("Average of price=" + average);
	}

	public void listProducts() {

		var products = jdbcTemplate.queryForList(
				"select p.prodname, p.price, c.catdesc from products p join categories c on p.catcode = c.catcode\n"
						+ "");

		for (var prod : products) {

			System.out.printf("%-30s %-10.2f %-30s\n", prod.get("prodname"), prod.get("price"), prod.get("catdesc"));
		}

	}

	public void listProdObjects() {

		List<products> product = jdbcTemplate.query(
				"select p.prodname, p.price, c.catdesc from products p join categories c on p.catcode = c.catcode\n",
				(rs, rowNum) -> new products(rs.getString("prodName"), rs.getString("price"), rs.getString("catdesc")));

		for (products p : product) {
			System.out.printf("%-30s %-10s %-30s\n", p.getProdname(), p.getPrice(), p.getCatdesc());

		}

	}

	@Override
	public void run(String... args) throws Exception {
		listProducts();
		listProdObjects();
		showAveragePrice();
	}

	public static void main(String[] args) {
		SpringApplication.run(displayProducts.class, args);
	}

}