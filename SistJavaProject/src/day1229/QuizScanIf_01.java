package day1229;

import java.util.Scanner;

public class QuizScanIf_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sangpum;
		int su,dan,money;
		
		System.out.println("상품명을 입력하세요->");
		sangpum= sc.nextLine();
		System.out.println("수량을 입력해주세요 ->");
		su= sc.nextInt();
		System.out.println("단가를 입력해주세요 ->");
		dan= sc.nextInt();
		
		money = su*dan;
		
		if(su>=5) {
			money=(money/100)*90;
		}
		System.out.println("[구입내역]");
		System.out.println(sangpum+" "+su+"개는 총 "+money+"원 입니다.");
		System.out.println("실제구입가격:"+money);
	}

}
