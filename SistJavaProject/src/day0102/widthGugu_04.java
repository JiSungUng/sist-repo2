package day0102;

public class widthGugu_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		System.out.println("가로방향 구구단 출력");
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"단]\t");
			 
		}
		
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	
	}

}
