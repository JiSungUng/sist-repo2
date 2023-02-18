package day0104;

import java.util.Calendar;
import java.util.Scanner;

public class ArrayDdi {

	public static void main(String[] args) {
//   이름과 태어난 연도를 입력한 후 홍길동 님은 개띠입니다... 
		String Ddi[] = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		int myYear, age;
		
		
		System.out.print("이름입력: ");
		name=sc.nextLine();
		System.out.print("태어난 연도 입력: ");
		myYear=sc.nextInt();
		
		
		
		String myDdi = Ddi[myYear%12];
		
		
		System.out.println(name+"님의 띠는 "+myDdi+"입니다.");
		

	}

}
