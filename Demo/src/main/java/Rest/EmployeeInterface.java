package Rest;

import java.util.List;

import RestPractise.Employee;

public interface EmployeeInterface {

	public List<Employee> getAll();
	
	public Employee getId(int id);
	
	public Employee add(Employee Employee);
	
	public void update(Employee Employee,int id);
}
