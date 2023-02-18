package day0105;


class obTestA{
	
	private int x;
	private static int y;

	//private이면 메서드로 접근가능.. 생성을 해도 참조변수로 변수에 접근이 안됨.
	
	//멤버수정 메서드
	//인스턴스 멤버메서드 _ this를 가지고있으므로 따로객체생성하지 않아도 멤버 접근
	public void setX(int xx) {
//		this.x =xx;
		x=xx; //이름이 틀릴땐 this 생략 가능.
	}
	//멤버 출력 메서드
	public void getX() {
		System.out.println("x= "+this.x);
	}

	public static void setY(int yy) {
		//static은 this를 가지고있지않다.
		//일반멤버변수 호출 못함.-> static 변수만 호출가능.
		obTestA.y=yy;// this를 가지고 있지 않기 때문에.
	}
	public static void getY() {
		System.out.println("y= "+obTestA.y);
	}
}

public class obTest_07 {

	
	
	
	public static void main(String[] args) {
		//x
		obTestA ta1 = new obTestA();
		ta1.setX(10);
		ta1.getX();
		
		obTestA ta2=new obTestA();
		ta2.setX(100);
		ta2.getX();
		
		//y
		//static메서드는 인스턴스로 호출하지않고 클래스명으로 호출
		obTestA.setY(200);
		obTestA.getY();
		
		
	}

}
