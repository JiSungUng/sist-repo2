package day0105;

	/*생성자 : 객체생성시 자동호출되는 메서드
	 * 1. 일반메서드와 차이점: 리턴형이 없다.
	 * 2. 메서드명은 클래스명과 같아야한다.
	 * 3. 오버로딩이 가능(즉 여러개의 생성자 만들기 가능)
	 * 4. 생성자가 없을 경우 기본생성자로 생성이 가능하다.
	 * 5. 생성자에서는 주로 멤버의 초기화 담당
	 * 6. 같은 생성자끼리는 호출은 this() 로 한다. (반드시 첫줄에 써야함!!)
	 * 
	 * */


	class Apple{
		public Apple() {
			System.out.println("Apple_디폴트생성자 호출");
		}
	}
	
	
	class Banana{
		public Banana(String str){
			System.out.println("Banana_생성자 호출"+str);
		}
	}
	
	class Orange{
		//생성자 오버로딩
		public Orange() {
			System.out.println("오렌지_디폴트 생성자 호출");
		}
		
		public Orange(String str) {
			System.out.println("오렌지_2번째 생성자 호출:"+str);
		}
		
		public Orange(int n) {
			this(); // 기본 생성자 호출,반드시 첫줄
			System.out.println("오렌지_3번째호출: "+n);
		}
	}

public class ObTestConst_08 {
	public static void main(String[] args) {

		Apple ap = new Apple();
		Banana ba= new Banana("Hello");
		
		//Banana =new Banana();  //기본 생성자가 없으므로 에러
		
		
		Orange or1=new Orange();
		Orange or2=new Orange("Hello");
		Orange or3=new Orange(20);
		
		
		
	}
	

}
	
