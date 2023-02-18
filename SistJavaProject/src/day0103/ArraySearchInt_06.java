package day0103;

import java.util.Scanner;
public class ArraySearchInt_06 {

	public static void main(String[] args) {
		/*선언된 배열에서 숫자를 입력하여 그 숫자가 있는지 찾기
		 * 없으면 없다고, 있으면 몇번째 있는지 출력
		 * 0입력시 종료*/
		int data [] = {5,12,54,23,69,99,88,77,125,4,2,6};
		
		boolean flag;
		Scanner sc=new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("검색할 숫자를 입력하세요.");
			num = sc.nextInt();
			
			//break;
			
			if(num == 0) {
				break;
			}
			
			flag = false;
			
			
			for(int i = 0;i<data.length;i++) {
				if(num == data[i]) {
					flag = true;
					System.out.println((i+1)+"번째에서 검색");
				}
			}
			if (!flag) {
				System.out.println("입력한 수는 데이터에 없습니다.");
			}
			}
	}

}
