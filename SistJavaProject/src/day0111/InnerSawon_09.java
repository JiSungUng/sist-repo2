package day0111;

import java.util.Scanner;

class PayOuter{
	private String sawonName;
	private int gibonPay,timeSu,familySu;
	
	//내부클래스 선언
	InputInner input = new InputInner();
	SudangInner output=new SudangInner();
	
	//메서드
	public void process() {
		//데이터 입력
		input.inputData();
		//데이타 출력
		output.writeData();
	}
	
	class InputInner{
		//내부클래스메서드
		public void inputData() {
			Scanner sc =new Scanner(System.in);
			System.out.println("사원명입력");
			sawonName = sc.nextLine();
			System.out.println("기본급은");
			gibonPay=sc.nextInt();
			System.out.println("초과시간은?");
			timeSu=sc.nextInt();
			System.out.println("가족수는?");
			familySu =sc.nextInt();
		}
		
		
	}
	
	class SudangInner{
		//내부클래스 메서드
		public int getTimeSudang() {
			return timeSu*20000;
		}
		public int getFamilySudang() {
			if(familySu<=3) {
				return 200000;
			}else
				return 300000;
		}
		
	
	public int getTax() {
		return (int)((gibonPay*0.03));
	
	}
	public int getPay() {
		return gibonPay+getFamilySudang()+getTimeSudang()-getTax();
	}
	public void writeData() {
		System.out.println("사원명\t기본급\t초과시간수\t시간수당\t가족수\t가족수당\t세금\t실수령액");
		System.out.println(sawonName+"\t"+gibonPay+"\t"+timeSu+"\t"+getTimeSudang()+"\t"+familySu+"\t"+getFamilySudang()+"\t"+getTax()+"\t"+getPay());
		
	}
}
}

public class InnerSawon_09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PayOuter pay =new PayOuter();
//		pay.process();
		
		//방법 2
		PayOuter pay =new PayOuter();
		PayOuter.InputInner input =pay.new InputInner();
		input.inputData();
		
		PayOuter.SudangInner output=pay.new SudangInner();
		output.writeData();
	}

}
