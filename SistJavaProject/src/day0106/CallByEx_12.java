package day0106;
//1. calllByValue 값만 전달받음(int ,double...String)
//2. callByReference : 배열은 객체로 인식, 주소가 전달됨.

class Test1{
	String name ="lee";
	String addr ="seoul";
}

public class CallByEx_12 {

	//1. callByValue: 값만 전달받음, 메인의 a와 여기 n은 주소가 다름
	public static void changeInt(int n) {
		System.out.println("전달받은 정수값: "+n);
		n=20;
	}
	
	//2. callByReference
	public static void changeArray(int arr[]) {
		System.out.println("전달받은 배열출력");
	
		for(int a:arr)
			System.out.println(a);
		arr[2]=90;
	}
	
	//3. callByReference.. Test1클래스
	
	public static void changeTest(Test1 t1) {
		System.out.println("전달받은 Test1객체 출력하기");
		System.out.println(t1.name+","+t1.addr);
		
		//값을 변경
		t1.name="이효리";
		t1.addr="제주시";
	}
	//4.
	public static void changeString(String str) {
		System.out.println("전달받은 문자열 :"+str);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		changeInt(a); 
		
		System.out.println("a의 값이 바뀔까 ?"+a);
		
		
		//2
		int arr2[] = {10,20,30} ;
		changeArray(arr2);
		
		System.out.println("메서드 호출 후 배열 값 확인하기");
		
		for(int ar:arr2)
			System.out.println(ar); //2번지값 바껴있음.
	
		//직접만든 클래스
		Test1 t1=new Test1();
		changeTest(t1);
		
		System.out.println(t1.name+","+t1.addr);
		
		
		//4
		String str = "Nice";
		changeString(str); //String 은 객체지만 값이 전달됨
		
		System.out.println("문자열변경확인: "+str); // 변경안됨
	}

}
