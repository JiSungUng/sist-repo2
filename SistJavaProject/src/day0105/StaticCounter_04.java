package day0105;

public class StaticCounter_04 {
	
//	int count =0;
	static int count =0;
	//생성자
	public StaticCounter_04() {
	
		count++;
		System.out.println(count);
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCounter_04 c1= new StaticCounter_04();
		StaticCounter_04 c2= new StaticCounter_04();
		
		//인스턴스 ㅡ변수는 서로다른 메모리이므로 카운트가 증가하지 않는다.
		//인스턴스에 공통으로 사용하고 싶다면 static을 붙인다.
		//만약 프로젝트내에서 공통으로 사용해야할 메서드라면 static메서드를 만든다.
		
	}

}
