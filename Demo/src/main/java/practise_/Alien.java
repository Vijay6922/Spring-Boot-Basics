package practise_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope(value="prototype")
public class Alien {

	private int id;
	private String name;
	private String tech;
	@Autowired
	@Qualifier("laptop")
	private Laptop Laptop;
	
	
	public Alien() {
		super();
		System.out.println("ok");
	}

	public void print ()
	{
		System.out.println("executed");
		Laptop.show();
	}
	

	public Laptop getLaptop() {
		return Laptop;
	}

	public void setLaptop(Laptop laptop) {
		Laptop = laptop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}
	
	

}
