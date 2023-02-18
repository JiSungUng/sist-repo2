package day0105;

public class MyInfo_09 {
	private String name;
	private int age;
	
	//setter 메서드
	//1. 인스턴스 변수에 지정된 데이터를 수정할 목적으로 사용 _set변수명
	//2. 저장용도이므로 결과값이 없다(return X)
	//3. 리턴타입은 void라고 지정한다.
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setAge(int age) {
		this.age =age;
	}
	//getter 메서드
	//1.인스턴스변수에 저장된 데이터를 조회할 목적으로 사용._get변수명
	//2.데이터를 얻는 목적 , 호출메서드 넘겨주는 데이터가 없으므로 인자없음.
	//3. 실행결과값을 돌려주므로 , return결과값 으로 지정한다.
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
