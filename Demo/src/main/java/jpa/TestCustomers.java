//package jpa;
//
//import java.io.Flushable;
//
//import org.hibernate.resource.transaction.spi.TransactionStatus;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.interceptor.TransactionAspectSupport;
//
//import jakarta.transaction.Transactional;
////@Component
////@SpringBootApplication
//public class TestCustomers implements CommandLineRunner {
//
//	@Autowired
//	private CustomerRepo cr;
//	
//	@Autowired
//	private JdbcTemplate jt;
//
//	public static void main(String[] args) {
//		SpringApplication.run(TestCustomers.class, args);
//	}
//
//	public void display() {
//		for (var c : cr.findAll()) {
//			System.out.printf("%d %s %s %s %s\n", c.getId(), c.getName(), c.getEmail(), c.getGender(), c.getNumber());
//		}
//
//	}
//		
//
//
//	public void Add(int id,String name, String email, String gender, String number) {
//		Customers c = new Customers();
//		c.setId(id);
//		c.setName(name);
//		c.setEmail(email);
//		c.setGender(gender);
//		c.setNumber(number);
//		cr.save(c);
//		System.out.println("Added");
//	}
//
//	public void Update(int id, String name, String email, String gender, String number) {
//		var c = cr.findById(id);
//		if (c.isPresent()) {
//			var find = c.get();
//			find.setName(name);
//			find.setEmail(email);
//			find.setGender(gender);
//			find.setNumber(number);
//			cr.save(find);
//			System.out.println("updated");
//		} else {
//			System.out.println("sorry not found");
//		}
//	}
//
//	public void delete(int id) {
//		cr.deleteById(id);
//		System.out.println("deleted");
//	}
//
//	@Override
//	public void run(String... args) {
//		display();
//		// Update(1,"vijay","1@gmail.com","M","123");
//		// Add(4,"Kumar","123@gmail.com","M","1234567890");
//		//delete(2);
//	}
//
//}
