package day0102;

public class ForStar_03 {

		public static void star1() {
			
			System.out.println("***다중 포문으로 start(*)출력하기");
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void star2() {
			System.out.println("***다중 포문으로 start(*)출력하기_열을  행만큼만.");
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		public static void star3() {
			System.out.println("***다중 포문으로 start(*)출력하기_열을 행만큼만 2번과 반대로.");
			for(int i=1;i<=5;i++) {
				for(int j=5;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		star1();
//		star2();
		star3();
	}

}
