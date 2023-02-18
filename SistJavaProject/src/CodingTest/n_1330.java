package CodingTest;

import java.util.Scanner;

public class n_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  ,b ;
		Scanner sc  = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<b) {
			System.out.println("<");
		}else if (a>b) {
			System.out.println(">");
		}else 
			System.out.println("==");
	}

}
