package day1228;

import java.util.Scanner;

public class IfMaxMin_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,max;
		System.out.print("두 수를 입력하세요");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("입력한 두수: "+x+","+y);
		
//		max=x>y?x:y;
		
		
		if(x>y) {
			max=x;
			
		}else{
			max=y;
		}
		System.out.println(" 두 수 중 더 큰 값은 "+max+"입니다.");
		System.out.println("첫번째 수가 더"+(x>=y?"크다":"작다"));
	}

}
