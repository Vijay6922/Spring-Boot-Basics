package RestPractise;

public class Employee {

	private int id;
	private String name;
	private String email;
	private long number;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	public Employee(int id, String name, String email, long number) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
	}
	public Employee() {
		super();
	}
	
}
