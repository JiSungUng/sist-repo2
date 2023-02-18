package day0103;

import java.util.Scanner;

public class ArraySearchString_07 {

	public static void main(String[] args) {
		
		
		//이름을 입력하여 있으면 몇번째에서 검색이 되는지 ,없으면 없다고 할것.
		// q or Q 입력하면 종료
		
		
		String data[] = {"김영돈","김희수","주하랑","이성희","이지민","권예지","김병훈","이우행"};
		boolean flag;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("이름을 입력하세요: ");
			String name = sc.nextLine();
			
			if(name.equalsIgnoreCase("q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			flag = false;
			for (int i = 0 ; i<data.length;i++) {
				if(name.equals(data[i])) {
					flag=true;
					System.out.println(i+1+"번째에 검색됩니다..");
				}
				
			}
			if (!flag) {
				System.out.println("입력한 글자는 데이터에 없습니다.");
			}
		}
		
		
	}

}
