package day0110;

//인터페이스는 다중구현이 가능하다.
//클래스가 클래스를 extends
//클래스가 인터페이스를 implements
//인터페이스가 인터페이스를 extends

public class Food implements FoodShop{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);   
		System.out.println("음식을 주문합니다.");
	}

	@Override
	public void baedal() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		System.out.println("주문한 음식을 배달합니다.");
	}

}
