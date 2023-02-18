package day1227;

public class CastingNum_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 타입을 int or double 타입으로 변경하려면
		//Integer.parseInt("1") -> 문자열 1이 정수 1 로 반환되는 메서드
		//Double.parseDouble("12.3") -> 문자열 12.3이 실수티입 12.3으로 반환되는 메서드
		
		String su1 = "9";
		String su2 = "5";
		
		System.out.println("두수 더하기: "+(su1+su2)); // 47
		
//		문자열 su1, su2를 정수타입 int로 변환 후 계산해보기
		int s1 = Integer.parseInt(su1);  //잘 알아두기!
		int s2 = Integer.parseInt(su2);
		
		System.out.println("두수 더하기: "+(s1+s2)); // 
		System.out.println("두수 빼기: "+(s1-s2)); // 
		System.out.println("두수 곱하기: "+(s1*s2)); // 
		System.out.println("두수 나누기: "+(s1/s2)); // 정수끼리 연산시 결과도 정수형
		
		
		float floatNum= Float.parseFloat(su2);
		System.out.println(floatNum);
		
	}

}
