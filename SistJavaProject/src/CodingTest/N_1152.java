package CodingTest;

import java.util.Scanner;

public class N_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	a =a.trim();
	
	if(a.isBlank() || a.isEmpty()) {
		System.out.println("0");
	}else	
	System.out.println(a.split(" ").length);
	
	
	}

}
 
