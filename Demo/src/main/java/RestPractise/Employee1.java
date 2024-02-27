package RestPractise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Rest.EmployeeInterface;
//@Service
public class Employee1 implements  EmployeeInterface{

	List<Employee> employee;
	
	public Employee1()
	{
		employee = new ArrayList<>();
		employee.add(new Employee(1,"vijay","123abc",123));
	}

	@Override
	public List<Employee> getAll() {
		
		return employee;
	}

	@Override
	public Employee getId(int id) {
		Employee e = null;
		for(Employee employee : employee)
		{
			if(employee.getId()==id)
			{
				e=employee;
				break;
			}
		}
		return e;
	}

	@Override
	public Employee add(Employee employee1) {
		employee.add(employee1);
		return employee1;
	}

	@Override
	public void update(Employee Employee1, int id) {
		{
			if(Employee1.getId()==id)
			{
				Employee1.setName(Employee1.getName());
				Employee1.setEmail(Employee1.getEmail());
				Employee1.setNumber(Employee1.getNumber());
				employee.add(Employee1);
			}
		}
		
	}
	
	
	
}
