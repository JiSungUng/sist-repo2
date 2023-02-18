package CodingTest;

import java.util.Scanner;

public class N_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr [] = new int[9];
	int max = 0;
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
			cnt=i+1;
			
		}
	}
	System.out.println(max);
	System.out.println(cnt);
	}

}
