package RestPractise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class emolpoyeeController {
	
	@Autowired
	private Employee1 e;
	
	@GetMapping("/e")
	public List<Employee> displayAll()
	{
		return this.e.getAll();
	}
	
	
	@GetMapping("/employee")
	public String display()
	{
		return "vijay";
	}
	
	@GetMapping("/employee/{id}")
	public String id(@PathVariable("id") int id)
	{
		return "id found" + id;
	}
	
	@DeleteMapping("/employee")
	public String del(@RequestParam int id)
	{
		return "deleted id " + id;
	}
	
	
	@PostMapping("/employee")
	public String Add1(@RequestBody Employee Employee)
	{
		return "details = " + Employee;
	}
	
	
	@GetMapping("/employeee/{id}")                              //returns single course
	public Employee getId(@PathVariable int id)
	{
		return this.e.getId(id);
	}
	
	@PostMapping("/employeee")                              
	public Employee add(@RequestBody Employee Employee)
	{
		return this.e.add(Employee);
	}
	
	@PutMapping("/employeee/{id}")                              
	public Employee update(@RequestBody Employee Employee,@PathVariable("id") int id)
	{
		this.e.update(Employee,id);
		return Employee;
	}
}
