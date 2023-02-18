package day0106;

public class ObtestReview_01 {
	String name;
	int age;
	
	public ObtestReview_01(String name) {
		this(name,19);
	}
	
	public ObtestReview_01(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObtestReview_01 ob =new ObtestReview_01("성웅",26);
		
		System.out.println("이름은 "+ob.getName()+"이고 나이는"+ob.getAge()+"세 입니다.");
		
		
	}

}
