package jongJavaCoder;

public class Encapsulation {

	
	int id;
	String name;
	String address;
	Double salary;
	
	public void info() {
		System.out.println("id : " + id);
		System.out.println("name : " + this.name);
		System.out.println("address : " + this.address);
		System.out.println("salary : " + this.salary);
	}
}
