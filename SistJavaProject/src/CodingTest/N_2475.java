package CodingTest;

import java.util.Scanner;

public class N_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int arr[] =new int [5];
		int temp[] = new int [5];
		int input;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
		
			input =sc.nextInt();
			arr[i]=input;
		}
		for(int i=0;i<arr.length;i++) {
			temp[i]= arr[i]*arr[i];
			sum+=temp[i];
		}
		System.out.println(sum%10);
	}

}
