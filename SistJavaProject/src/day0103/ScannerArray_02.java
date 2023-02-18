package day0103;

import java.util.Scanner;

public class ScannerArray_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int [] data;
		int sum =0;
		data = new int [5];
		
		//값 입력
		for ( int i = 0; i<data.length;i++) {
			System.out.println((i+1)+"번째 값: " );
			data[i]= sc.nextInt();
			
			sum+=data[i];
			
		}
		System.out.println("데이터 값의 합 : "+sum);
		
		for(int i=0; i<data.length;i++) {
			System.out.println(i+1+"==>"+data[i]);
		}
	}

}
