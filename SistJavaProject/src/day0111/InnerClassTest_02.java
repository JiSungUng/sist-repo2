package day0111;

class OuterObj{
	
	/*내부클래스_ 클래스안에 클래스 존재
	 * 이너클래스는 아웃클래스 안에서만 사용가능
	 * */
	
	class InnerObj{ //멤버내부클래스_하나의 객체로 인식
		
		public void write() {
			System.out.println("내부 클래스의 메서드");
		}
	}
	
	public void disp() {
		System.out.println("외부클래스의 메서드 ");
		System.out.println("외부에서 내부클래스의 메서드를 호출");
		
		InnerObj inObj = new InnerObj();
		inObj.write();
	}
}

//////////////////////////
public class InnerClassTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterObj outObj = new OuterObj();
		outObj.disp();
		System.out.println("-----------------------------");
		//내부클래스의 메서드 접근 ... 외부를 통해서만

//		OuterObj.InnerObj obj= new OuterObj().new InnerObj();
		
		OuterObj.InnerObj obj = outObj.new InnerObj();
		obj.write();
		
	}

}
