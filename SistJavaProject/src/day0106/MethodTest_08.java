package day0106;



public class MethodTest_08 {

	//자바프로그램 시작은 main이라는 이름의 메소드를 시작하는 것에서 시작.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램시작~~~");
		goodMorning(22);
		hello("김희수");
		goodMorning(33);
		hello("김예은");
		System.out.println("프로그램끝!!!");
		
		
	}

		public static void goodMorning(int age) {
			System.out.println("좋은 아침입니다.");
			System.out.println("제나이는"+age+"세 입니다.");
		}
		
		
		public static void hello(String name) {
			System.out.println("안녕?");
			System.out.println("내 이름은 "+name+"입니다.");
		}
}
