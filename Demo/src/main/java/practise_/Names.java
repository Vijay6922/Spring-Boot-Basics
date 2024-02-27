package practise_;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("prototype")
@Primary
public class Names implements Doctors{

	public void show()
	{
		System.out.println("working");
	}
	@Override
	public List<String> getNames()
	{
		return List.of("vijay","kumar");
	}
	@Override
	public List<String> getDept()
	{
		return List.of("Residental","Consultant");
	}
}
