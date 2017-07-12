package Employee;

public class Main {

	/*public int umur = 40; //primitive data type //type data not have class
	public Integer umur2 = 40; // type data have class
	public Employee director = new Director();
	public Employee manager = new Manager();
	public Employee programmer = new Programmer();
	public Employee employee = new Employee();*/
	Employee director, manager, programmer, employee;
	
	public void inheritanceExam() {
		//instance
		employee = new Employee();
		director = new Director();
		manager = new Manager();
		programmer = new Programmer();
		
		director.setSalary(5000.0);
		System.out.println("salary director : " + director.getSalary());
		
		manager.setSalary(5000.0);
		System.out.println("salary manager : " + manager.getSalary());
		
		//casting
		Employee a = new Manager();
		Manager b = (Manager) new Employee();
		
		//parse
		String anu = "21";
		Integer ab = Integer.parseInt(anu);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.inheritanceExam();
	}
}
