package practise_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
//@Component
//@SpringBootApplication

 class displayDoctors1 implements CommandLineRunner{
	
	@Autowired
	Doctors doc;
	
	@Autowired
	Names names;
	
	
	
	public displayDoctors1(Names names) {
		super();
		this.names = names;
		System.out.println("displays");
	}


    @Override
	public void run(String...args) 
	{
		System.out.println("names");
		for(String names : names.getNames())
		{
			System.out.println(names);
		}
		System.out.println("deptartment");
		for(String dept : names.getDept())
		{
			System.out.println(dept);
		}
	}

}
 
 public class displayDoctors
 {
	 public static void main(String args[])
	 {
		 SpringApplication.run(displayDoctors.class, args);
	 }
 }
