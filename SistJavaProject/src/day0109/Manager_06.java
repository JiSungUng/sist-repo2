package day0109;

public class Manager_06 extends Emp_06 {
	String  depart;
	public Manager_06(String name, int sal,String d) {
		super(name, sal);
		this.depart = d;
		
	}

	//부모메서드를 재정의 (오버라이딩)
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee()+","+depart;
	}
}
