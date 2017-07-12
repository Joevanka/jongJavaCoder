package Employee;

public class Manager extends Employee{

	@Override
	public void setSalary(Double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary * 2);
	}
}
