package day0105;

public class cardMain_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CardTest_02.width);
		System.out.println(CardTest_02.height);
		
		
		CardTest_02.width =10;
		CardTest_02.height =20;

		
		System.out.println(CardTest_02.width);
		System.out.println(CardTest_02.height);
		
		//인스턴스변수 생성
		CardTest_02 c1 = new CardTest_02();
		
		System.out.println(c1.kind);
		System.out.println(c1.number);
		
		
		c1.kind ="Heart";
		c1.number=7;
				
		System.out.println(c1.kind);
		System.out.println(c1.number);
				
		CardTest_02 c2 = new CardTest_02();
		
		c2.kind ="spade";
		c2.number=4;
		
		System.out.println(c1.kind+","+c1.number+","+CardTest_02.width+","+CardTest_02.height);
		System.out.println(c2.kind+","+c2.number+","+CardTest_02.width+","+CardTest_02.height);
		
	}

}
