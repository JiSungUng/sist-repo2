package day0105;

class StuInfo{
	private String name;
	private String hp;
	public static final String ADDR="seoul";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp=hp;
	}
	public void getName(String name) {
		System.out.println("이름:"+this.name);
	}
	
	
	public void getHp(String hp) {
		System.out.println("연락처"+this.hp);
	}
	
	public void setData(String name, String hp) {
		this.name=name;
		this.hp=hp;
		
	}
	//get은 값을 반환하기 위해서 만들어주는 것.
	public void getData(String name, String hp) {
		
	}
	
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	
	public void showInfo() {
		System.out.println("이름:"+this.name+"연락처"+this.hp);
	}
	
	
	//출력메서드                이걸 이용하여도 됨!.!
//	public void write() {
//		System.out.println("지역:"+ADDR);
//		System.out.println("이름:"+this.name);
//		System.out.println("연락처:"+hp);
//	}
	
	
	
}


public class QuizObTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StuInfo si = new StuInfo();
		System.out.println("지역"+si.ADDR);
		si.setName("지성웅");
		si.getName(null);
		si.setHp("010-0000-0000");
		si.getHp(null);
	}

}
