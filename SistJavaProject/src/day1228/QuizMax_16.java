package day1228;

import java.util.Scanner;

public class QuizMax_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,z,max;
		
		System.out.println("세 수를 입력하세요->");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x>y&&x>z) {
		System.out.println("가장 큰 수는: "+x);
		}else if(y>x&&y>z) {
			System.out.println("가장 큰 수는: "+y);
		}else
		{
			System.out.println("가장 큰 수는: "+z);
		}
	
		//삼항 연산자
		  max = ((x > y) && (x > z)) ? x : ((y > x) && (y > z)) ?y : z;
		  
		  System.out.println(max);
	}
	

}
