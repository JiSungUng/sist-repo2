package day0105;

public class MyCarMain_13 {

	public static void main(String[] args) {
		MyCar_13 mc = new MyCar_13();
		System.out.println("***나의 자동차 정보***");
		mc.setCarName("그랜져");
		mc.setPrice(4000);
		mc.setColor("진주색");
		mc.getCarName(null);
		mc.getPrice(null);
		mc.getColor(null);
		
		System.out.println("***자동차명 변경 후 출력***");
		mc.setCarName("제네시스");
		mc.setPrice(8000);
		mc.setColor("그레이");
		mc.getCarName(null);
		mc.getPrice(null);
		mc.getColor(null);
		
		
		
	}

}
