package day0109;

public class EmpMain_06 extends Manager_06{

	public EmpMain_06(String name, int sal, String d) {
		super(name, sal, d);
		this.name = name;
		this.salery = sal;
		this.depart = d;
		
	}
public void writeData() {
	System.out.println("이름: "+this.name);
	System.out.println("급여: "+this.salery);
	System.out.println("부서: "+this.depart);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpMain_06 em = new EmpMain_06("이효리", 2300000,"디자인부");
		em.writeData();
	}

}
//Manager_06 man=new Manager_06("이승기",1200000,"기획재정부");
// system.out.println(man.getEmplyee()); // 재정의 된 메서드가 호출된다.