package jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component
@SpringBootApplication
public class Test implements CommandLineRunner{

	@Autowired
	private productsRepo pr;
	
	@Autowired
	private SalesRepo sr;
	
	public void getSales1(int min,int max)
	{
		for(var c: sr.getSales1(min, max))
		{
			System.out.printf("%d %d",c.getInvno(),c.getProdid());
		}
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		sr.getSales1(2, 1000);
	}
	
	
}
