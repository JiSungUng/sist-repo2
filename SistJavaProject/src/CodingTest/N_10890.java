package CodingTest;
import java.util.Scanner;

public class N_10890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in = new Scanner(System.in);
	 
	 
			int[] arr = new int[26];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = -1;
			}
	 
			String S = in.nextLine();
	 
			for(int i = 0; i < S.length(); i++) {
				char ch = S.charAt(i);
	    
				if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
					arr[ch - 'a'] = i;
				}
			}
	 
			for(int val : arr) {	// 배열 출력
				System.out.print(val + " ");
			}
		}
	
	}


