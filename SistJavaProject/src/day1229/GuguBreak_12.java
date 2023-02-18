package day1229;

public class GuguBreak_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loop: for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				if (j == 3) {
					break loop; // 자신이 속한 반복문을 빠져나갑니다.   //레이블명(loop?)을 같이 쓰게되면 2개이상의 반복문을 빠져나가는 것이 가능하다.
				}

				System.out.println(i + "X" + j + "=" + i * j);

			}
			System.out.println();
		}
	}

}
