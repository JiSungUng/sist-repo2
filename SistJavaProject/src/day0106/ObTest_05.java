package day0106;

class Jungbo{
	private String name;
	private String address;
	private String hp;

	
	//각각의 setter,getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	//3개의 멤버 한번의 수정하는 메서드
	
	public void setData(String name, String address, String hp) {
		
		this.name = name;
		this.address  = address;
		this.hp = hp;
		
	}
	
	public void writeData() {
		System.out.println("이름: "+this.name);
		System.out.println("주소: "+this.address);
		System.out.println("연락처: "+this.hp);
	}
}



public class ObTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 디폴트 생성.. 각각의 setter,getter 출력
		Jungbo jb1 = new Jungbo();
		Jungbo jb2 = new Jungbo();
		jb1.setName("유재석");
		jb1.setAddress("서울식 강동구");
		jb1.setHp("010-1234-5678");
		System.out.println("1. 값출력");
		System.out.println("이름"+jb1.getName());
		System.out.println("주소"+jb1.getAddress());
		System.out.println("연락처"+jb1.getHp());
		
		//2. 디폴트 생성 .. 3개멤버 한번에 수정하는 메서드
		System.out.println("값 변경후 출력");
		jb2.setData("강호동", "경기도 시흥시", "010-555-7777");
		jb2.writeData();
		
		//3개의 멤버 한번에 리턴하는 메서드
	}

}
