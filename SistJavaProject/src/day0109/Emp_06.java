package day0109;

//super
public class Emp_06 {
	String name;
	int salery;
	
	public Emp_06(String name, int sal) {
		this.name=name;
		this.salery =sal;
	}
	
	
	public String getEmployee() {
		return name+","+salery;
	}
}
