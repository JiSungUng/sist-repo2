package day0113;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * 상품명 ? 마우스
 * 수량 ? 12
 * **상품재고현황**
 * No. 상품명 수량 단가 총금액*/
public class ArrayListShop_09 {
	List<Shop> list = new ArrayList<>();
public void inputData() {
	Scanner sc =new Scanner(System.in);
	String sangpum;
	int su;
	int dan;
	int total;
	
	System.out.println("상품명?");
	sangpum = sc.nextLine();
	System.out.println("수량?");
	su = Integer.parseInt(sc.nextLine());
	System.out.println("단가?");
	dan = Integer.parseInt(sc.nextLine());
	 
	 Shop shop = new Shop();
	 shop.setSangpum(sangpum);
	 shop.setSu(su);
	 shop.setDan(dan);
	 
	 list.add(shop);
	}

public void writeData() {
	System.out.println("**상품재고현황**");
	System.out.println("==================================");
	
	for(int i = 0; i<list.size();i++) {
		Shop s = list.get(i);
		
		System.out.println("No."+(i+1)+"\n상품명: "+s.getSangpum());
		System.out.println("수량: "+s.getSu());
		System.out.println("단가: "+s.getDan());
		System.out.println("총금액: "+((s.getSu()*s.getDan())));
		System.out.println("=============================================");		
	}
}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListShop_09 as = new ArrayListShop_09();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1.추가    2.전체출력    9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				as.inputData();
			else if(n==2)
				as.writeData();
			else if(n==9) {
				System.out.println("**종료합니다.**");
				break;
			}
		}
	}

}
