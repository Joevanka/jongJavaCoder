package Employee;

public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address, Double salary, String phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.phonenum = phonenum;
	}

	
	//field //variable //property
	private int id;
	private String name;
	private String address;
	private Double salary;
	private String phonenum;
	
	
	
	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("id : " + id);
		System.out.println("name : " + this.name);
		System.out.println("address : " + this.address);
		System.out.println("salary : " + this.salary);
		System.out.println("phone number : " + phonenum);
	}
}
