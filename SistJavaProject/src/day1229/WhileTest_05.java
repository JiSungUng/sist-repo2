package day1229;

public class WhileTest_05 {

	public static void main(String[] args) {
		// while(조건식)
//		{
//		수행할 문장
//	}
//		*->조건식이 참일동안 반복재생
//		->조건식이 처음부터 안맞으면 한번도 실행 안함 (do~while)은 안맞아도 한번은 샐행함.)
//		

		int n = 0;
		while (n < 10) {
			n++;
			System.out.printf("%4d", n);

		}

		System.out.println();

		n = 0;
		while (n < 10) {

			System.out.printf("%4d", ++n);
		}
		
		System.out.println();
	
		//3. 조건을 true로 주었을때 
		n = 0;
		while (true) {

			System.out.printf("%4d", ++n);
			
			if(n==10) {
				break;
			}
		}
		
	}
	

}
