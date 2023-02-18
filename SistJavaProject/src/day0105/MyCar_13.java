package day0105;

public class MyCar_13 {

	private String carName;
	private int price;
	private String color;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void getCarName(String carName) {
		System.out.println("자동차명: "+this.carName);
	}
	public void getPrice(String price) {
		
		System.out.println("차량가격: "+this.price);
	}
	public void getColor(String color) {
		System.out.println("차량색상: "+this.color);
		
	}
	
	
//	public void myCar() {
//		MyCar_13 mc = new MyCar_13();
//		System.out.println("***나의 자동차 정보***");
//		mc.setcarName("그랜져");
//		mc.setPrice(4000);
//		mc.setColor("진주색");
//		mc.getcarName(null);
//		mc.getPrice();
//		mc.getColor();
		
//	}
	
//	public void writeCarInfo() {
//		System.out.println(carName);
//		System.out.println(this.price);
//		System.out.println(this.color);
//	}
//	
	
}
