package day1227;

public class CastingNum_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		int java=Integer.parseInt(args[1]);
		int oracle=Integer.parseInt(args[2]);
		int total = java+oracle;
		System.out.println("내 이름은 "+args[0]);
		System.out.println("자바 점수는 "+args[1]);
		System.out.println("오라클 점수는 "+args[2]);
		
		System.out.println("두과목의 합계는 "+total + " 입니다.");
		
	}

}
