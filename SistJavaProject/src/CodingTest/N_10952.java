package CodingTest;

import java.util.Scanner;

public class N_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum[]= new int [];
		int cnt=0;
		while(true) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			sum [cnt] =a+b;
			cnt++;
			if(a==0 &&b==0) {
				break;
			}
		}
		for(int i=0; i<sum.length;i++) {
			System.out.println(sum[i]);
		}
	}

}
