package day1228;

import java.util.Scanner;

public class OperTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int su1, su2; // 입력 값
		int add, sub, mul, div, mod;
		
		System.out.println("두 개의 숫자를 입력하세요");
		su1= sc.nextInt();
		su2= sc.nextInt();
		
		add= su1+su2;
		sub= su1-su2;
		mul= su1*su2;
		div= su1/su2;
		mod= su1%su2;
		
		System.out.println("****결과 값 출력****");
		System.out.println("덧셈"+add);
		System.out.println("뺄셈"+sub);
		System.out.println("곱셈"+mul);
		System.out.println("나눗셈"+div);
		System.out.println("나머지"+mod);
		
	}

}
