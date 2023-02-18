package day0110;

public class FruitInherit_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			Apple apple = new Apple();
//			Banana banana = new Banana();
//			Orange orange =new Orange();
//			Kiwi kiwi = new Kiwi();
//			
//			apple.showMessage();
//			banana.showMessage();
//			orange.showMessage();
//			kiwi.showMessage();
		
		//다형성처리
		//다형성은 하나의 변수로 여러가지 일을처리할때
		//다형성은 하위클래스로 생성
		//부모클래스명 참조변수명 =new 자식클래스명();
		
		Fruit fruit;
		fruit = new Apple();
		fruit.showMessage();
		
		fruit = new Banana();
		fruit.showMessage();

		fruit = new Orange();
		fruit.showMessage();
	
		fruit = new Kiwi();
		fruit.showMessage();
	}

}
