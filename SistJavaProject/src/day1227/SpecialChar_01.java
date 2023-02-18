package day1227;

public class SpecialChar_01 {

	public static void main(String[] args) {
		// 문자열내에서 특벼한 의미로 해석되는 문자_Escape Sequence(\를 이용)
//		\t -> 다음 탭으로 이동
//		\n -> 다음 줄
//		\' -> 따옴표
//		\" -> TKdEKdhavy
//		\\-> 빽슬랙시
		System.out.print("Apple\t");
		System.out.print("Orange\tMellon");
		System.out.println();
		System.out.println("Apple\"");
		System.out.println("Apple\\");
		System.out.println("\"Apple\"");
		System.out.println("c:\\");
		System.out.println("Q.\"예은\",\"종수\",\"재승\"");
		

	}

}
