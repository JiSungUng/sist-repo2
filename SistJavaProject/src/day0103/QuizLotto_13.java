package day0103;

import java.util.Scanner;

public class QuizLotto_13 {

	public static void main(String[] args) {

		/*
		 * 로또 구매금액(개수)을 입력한후 출력하시오 로또 구매금액은? 5000 1회: 4 20 22 26 38 44 2회: 4 20 22 26 38
		 * 44 3회: 4 20 22 26 38 44 4회: 4 20 22 26 38 44 5회: 4 20 22 26 38 44 금액이 1000원
		 * 이하이면 -금액이 부족합니다.
		 */
		int lot;
		int money;
		int lotto[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 구매 금액은?");

		while (true) {
			lot = sc.nextInt();
			money = lot / 1000;
			if (money < 1) {
				System.out.println("금액이 부족합니다. 재입력해주세요");
				continue;
			}
			for (int a = 0; a < money; a++) {

				System.out.println();

				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
							break;
						}
					}
				}

				for (int j = 0; j < lotto.length - 1; j++) {
					for (int z = j; z < lotto.length; z++) {
						if (lotto[j] > lotto[z]) {
							int temp = lotto[j];
							lotto[j] = lotto[z];
							lotto[z] = temp;
						}
					}
				}

				for (int i = 0; i < lotto.length; i++) {
					System.out.printf("%5d회:%d", a + 1, lotto[i]);

				}

			}
			break;

		}
	}

}
