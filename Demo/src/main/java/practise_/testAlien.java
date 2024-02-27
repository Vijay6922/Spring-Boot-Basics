package practise_;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
public class testAlien {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = SpringApplication.run(testAlien.class, args);
		Alien a = c.getBean(Alien.class);
		a.print();
		a.setId(0);
		System.out.println(a.getId());
		Laptop l = new Laptop();
		l.setLid(1);
		l.getLid();
		System.out.println(l.getLid());
		
		
		//		Alien a1 =c.getBean(Alien.class);
//		a1.print();                         //only one object is created even when u call multiple times...
//		                                    //but after using prototype multiple objects can be created ... 
//		
	}

}
