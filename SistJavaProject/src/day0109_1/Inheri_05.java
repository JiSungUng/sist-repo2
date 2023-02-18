package day0109_1;

import day0109.SuperObj_05;

class SubObj extends SuperObj_05{
	
	private String addr;
	//생성자
	public SubObj(String name, int age,String addr) {
		super(name, age);
		this.addr =addr;
		
	}
	public void writeData() {
		System.out.println("이름 :"+this.name); //부모에게서 받은 객체는 this
		System.out.println("나이 :"+this.age);
		System.out.println("주소 :"+this.addr);
		
		
	}
}
///////////////////////////////
public class Inheri_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubObj sub = new SubObj("이효리",23,"제주시");
		sub.writeData();
	}

}
