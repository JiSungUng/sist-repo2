package CodingTest;

import java.util.Scanner;

public class N_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b,c,val;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		val=a*b*c;
		String str = Integer.toString(val);
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}