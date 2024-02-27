package jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
//@Component
//@SpringBootApplication
class products1 implements CommandLineRunner{

		@Autowired
		private JdbcTemplate jt;
		
		public void run(String...args) throws Exception
		{
			//avg();
			listProducts();
			//listProductObjects();
			
		}
		
		public void avg()
		{
			Double a = jt.queryForObject("select avg(Price) as avg from products",Double.class);
			System.out.println("average Price =" + a);
		}
		
		public void listProducts()
		{
			var products = jt.queryForList("select prodid,prodname from products");
			for(var p : products)
			{
				System.out.printf("%-30s %-10.2f",p.get("prodid"),p.get("prodname"));
			}
		}

}

public class listProducts
{
	public static void main(String args[]) {
		SpringApplication.run(listProducts.class);
	}
}

