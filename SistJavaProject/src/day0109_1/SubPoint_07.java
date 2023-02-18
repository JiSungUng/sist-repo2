package day0109_1;

import day0109.Point_07;

public class SubPoint_07 extends Point_07 {
	
	String msg;
	public SubPoint_07(int x, int y,String msg) {
		super(x, y);
		this.msg=msg;
		// TODO Auto-generated constructor stub
	}
	public SubPoint_07() {
		super(); //생략 되어 있음.
		System.out.println("sub_디폴트 생성자");
	}
	
	
	public void write() {
		super.write();
		System.out.println("메세지: "+msg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubPoint_07 sp =new SubPoint_07();
		sp.write();
		SubPoint_07 sp2 =new SubPoint_07(100,200,"Happy Day!!");
		sp2.write();
	}

}
