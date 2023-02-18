package CodingTest;

import java.util.Scanner;

public class N_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num,num1,num2;
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=0;i<num1;i++) {
			num=sc.nextInt();
			if(num<num2) {
				System.out.print(num+" ");
			}
		}
	}

}
