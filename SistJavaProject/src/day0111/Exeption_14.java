package day0111;

import java.util.Scanner;

/*throws -> 호출한 영역으로 예외처리를 던짐.
 * throw -> 강제로 예외를 발생시킬때*/

public class Exeption_14 {

		public static void scoreInput() throws Exception {
			Scanner sc = new Scanner(System.in);
			
			int score =0;
			
			//점수가 0~100 사이가 아니라면 exception 강제 발생
			System.out.println("점수를 입력하세요");
			
			score =sc.nextInt();
			if(score<0 || score>100) {
				throw new Exception("점수가 잘못되었습니다.");
			}else{
				System.out.println("나의 점수는 "+score+"점 입니다.");
			}
					
		
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("안녕하세요....");
//		System.out.println("3초뒤 헤어집시다.");
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("안녕히 계세요.");
		
//		Exeption_14 ex = new Exeption_14();
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("오류메세지: "+e.getMessage());
		}
		System.out.println("정상종료");
	}

}
