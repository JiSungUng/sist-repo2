package CodingTest;

import java.util.Scanner;

public class N_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [26];  //영문 26개
		String input = sc.nextLine().toUpperCase(); // 모두 대문자로 바꾸어주기  소문자는 toLowerCase();
		
		for(int i = 0; i<input.length();i++) {
			int temp = input.charAt(i) -65;  //  i 번째 대문자 -65 (아스키코드 'A' )
			arr[temp]++;  // 배열에 넣어준다.
		}
		
		int max = -1 ; // 배열안에 초기 값이 0 이므로 -1 로 지정
		char ch = ' ';
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
				ch=(char)(i+65);
			}else if (arr[i]==max) {
				ch='?';
			}
		}
		System.out.println(ch);
		
	}

}
