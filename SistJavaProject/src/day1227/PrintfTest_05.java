package day1227;

public class PrintfTest_05 {

	public static void main(String[] args) {
		// 문자열을 구성해서 출력하는 것이 printf
		// 문자열 뒤에 따라오는 데이터를 순서대로 배치.
		// 정수 : %d , 실수 : %f , 문자 : %c , 문자열 %s
		
		int num1 = 10 , num2 = 20;
		int num3 = num1 +num2 ;
		
		//print 출력
		System.out.println(num1 +"+"+num2+ "="+num3);
		//printf 츌력
		System.out.printf("num1의 값은 %d, nume2 의 값은 %d , num3 의 값은 %d입니다.",num1, num2,num3);
		
		System.out.println();
		
		String name = "지성웅";
		int age = 25;
		System.out.printf("안녕하세요 제 이름은 %s 입니다\n 나이는 %d 입니다.",name ,age);
	}

}
