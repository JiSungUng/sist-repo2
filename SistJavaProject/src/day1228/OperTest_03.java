package day1228;

public class OperTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=b=5;
		
		//단항일경우에는 앞에 붙이나 뒤에붙이나 같다.
		++a; //원래있는 a 에서 1증가
		b++;//b=b+1
		
		System.out.println("a="+a +", b="+b);  // a= 6 , b= 6 
		
		//수식에서 사용시는 전치, 후치가 결과값이 틀리다.
		
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //후치일경우에는 먼저 대입후 증가
		
		System.out.println("m"+m +",a"+a);  // m=5 , a=6
		
		
		n=++b;//전치일 경우에는 먼저 증가 후 대입
		System.out.println("n"+n +",b"+b);  // m=5 , a=6
	}

}
