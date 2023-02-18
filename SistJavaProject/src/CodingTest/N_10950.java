package CodingTest;

import java.util.Scanner;

public class N_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int a,b;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		int arr []= new int [num];
		for (int i=0;i<num;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			arr[i]=a+b;
		}
		
		for (int i=0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
