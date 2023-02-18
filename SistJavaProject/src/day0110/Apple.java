package day0110;

public class Apple extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);// 프룻 생략가능
		System.out.println("Apple_ShowMessage");
	}

}
