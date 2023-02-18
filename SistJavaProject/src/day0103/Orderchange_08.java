package day0103;

public class Orderchange_08 {

	public static void main(String[] args) {
		
		//배열의 순서바꾸기 연습  //temp 사용
		
		int a =10, b=20;
		
		System.out.println("a="+a+"b"+b);
		
		int temp;
		
		temp = a;
		a=b;
		b= temp;
		System.out.println("a="+a+"b"+b);
		
		System.out.println("배열 순서 변경");
		
		int a1 []= {5,7,2};
		
		for (int n : a1) {
			System.out.print(n+"  ");
		}
		System.out.println();
		System.out.println("0번과 2번 교환");
		
		
		int temp1 =a1[0];
		a1[0]=a1[2];
		a1[2]=temp1;
		
		System.out.println();
		
		for(int n1:a1) {
			System.out.print(n1+" ");
		}
		
	
	}

}
