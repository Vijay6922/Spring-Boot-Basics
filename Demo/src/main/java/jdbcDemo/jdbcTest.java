package jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class jdbcTest implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jt;
	
//	@Autowired
//	private DataSource ds;
	
	@Override
	public void run(String...args) throws Exception
	{
		addCategory("1cat","1meow");
		//list();
	}
	public void addCategory(String catcode, String catdesc) {
		jt.update("insert into categories values(?,?)", catcode,catdesc);
		System.out.println("Added Successfully!");
	}
	public void list()
	{
		var c = jt.queryForList("select catcode,catdesc from categories");
		
		for(var cat:c)
		{
			System.out.printf("%-10s %-30s\n", cat.get("catcode"), cat.get("catdesc"));	
			}
	}
	
//	@Override
//	public void run(String...args) throws Exception
//	{
//		System.out.println(jt.getClass().getName());
//		System.out.println(ds.getClass().getName());
//	}
	
}
