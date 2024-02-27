package ioc;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component   // for Spring Bean
public class javaCatalog implements Catalog {

	//public javaCatalog() {
	    //System.out.println("JavaCatalog()");
	
	@Override
	public List<String> getBooks() {
		return List.of("Java Complete Reference", "Java Persistence with Hibernate");
	}

}