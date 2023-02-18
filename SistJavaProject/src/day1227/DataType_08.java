package day1227;

public class DataType_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//묵시적 형변환 자동으로 결정되는 타입
		//String + int =String
		//double + int = double
		//long+short = long
		//char + int = int 
		
		char a='A'; // 65  아스키코드
		System.out.println(a);
		System.out.println(a+1);//66
		System.out.println((char)(a+1));//B

	}

}
