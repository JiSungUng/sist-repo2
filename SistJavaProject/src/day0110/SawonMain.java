package day0110;

import java.util.Scanner;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sawon s1;

		String name;
		int pay;
		int timeSu;
		int familySu;
		System.out.println("사원명은? ");
		name=sc.nextLine();
		System.out.println("기본급여는? ");
		pay =Integer.parseInt(sc.nextLine());
		System.out.println("가족수는? ");
		familySu =Integer.parseInt(sc.nextLine());
		System.out.println("초과근무시간은? ");
		timeSu =Integer.parseInt(sc.nextLine());
		System.out.println();
		
		
		s1 = new Sawon(name,pay,timeSu, familySu);
		
		System.out.println("사원명\t기본급\t가족수당\t시간외수당\t실수령액");
		System.out.println(s1.getSawonName()+"\t"+s1.getGibonPay()+"\t"+s1.getFamilyPay()+
				"\t"+s1.getTimePay()+"\t"+s1.getTotalPay());
	}

}
