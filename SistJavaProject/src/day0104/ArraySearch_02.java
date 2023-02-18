package day0104;

import java.util.Scanner;

public class ArraySearch_02 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력하여 배열에 몇번째 있는지 출력하고 없을경우 없습니다 라고 출력하시오. 반복해서 입력하다가 0입력시 종료
		 * 
		 * 입력 값 :45 45는 2번째에 있습니다. 이볅값 : 200 은 없습니다.
		 * 
		 * 입력값 0 프로그램 종료.
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = { 23, 45, 89, 111, 2, 3, 66, 99, 88, 54, 21, 100 };

		while (true) {
			System.out.println("입력값:");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("프로그램 종료");
				break;

			}
			boolean find = false;

			// 배열의 개수만큼 반복하면서 숫자 찾기
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					find = true;
					System.out.println("\t" + (i + 1) + "번째에 있습니다!");
				}
			}

			// 배열에 없으면 find 는 여전히 false.
			if (!find) {
				System.out.println("\t" + num + "는 배열에 없습니다.");
			}

		}

	}

}
