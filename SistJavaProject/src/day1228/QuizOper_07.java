package day1228;

import java.util.Scanner;

public class QuizOper_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aks ,cjs, qor, tlq ,dlf;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알바비를 입력하세요");
		int money = sc.nextInt();
		
		aks=money /10000;
		cjs=(money%10000)/1000;
		qor=(money%1000)/100;
		tlq=(money%100)/10;
		dlf=(money%10)/1;
		
		System.out.println("알바비:"+ money);
		System.out.println("만원"+aks);
		System.out.println("천원"+cjs);
		System.out.println("백원"+qor);
		System.out.println("십원"+tlq);
		System.out.println("일원"+dlf);
//		
	}

}
