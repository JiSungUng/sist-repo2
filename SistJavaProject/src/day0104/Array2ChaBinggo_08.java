package day0104;

import java.util.Scanner;

public class Array2ChaBinggo_08 {

	public static void main(String[] args) {
		/*3행 3열로 2차원배열을 만들고 엔터를 누르면
		 * 1~3사이의 난수가 발생된다.
		 * 가로,세로,대각선에서 같은숫자가 나오면 binggo 1개
		 * 종료 :q*/
			
		Scanner sc = new Scanner(System.in);
		int pz[][] = new int [3][3];
		int binggo =0;
		
		while(true) {
			
			
			
			//3행 3열의 배열에 1~3 사이의 난수를 발생시킨다.
			System.out.println("***같은숫자가 나오면 빙고!!!***");
			//난수
			for(int i=0;i<pz.length;i++) {
				for(int j=0;j<pz[i].length;j++) {
					pz[i][j]= (int)(Math.random()*3)+1;
				}
			}
			//출력
			for(int i=0;i<pz.length;i++) {
				for(int j=0;j<pz[i].length;j++) {
					System.out.printf("%3d",pz[i][j]);
				}
				System.out.println();
			}
			//빙고개수 구하기 
			binggo =0;
			
			//가로 3개 , 세로 3개
			for(int i=0;i<pz.length;i++) {
				if(pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2])
					binggo++;
					if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i])
						binggo++;
			}
			//대각선
			if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2])
				binggo++;
			if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0])
				binggo++;
			
			if(binggo ==0)
				System.out.println("\t꽝");
			else 
				System.out.println("\t빙고"+binggo+"개!!!");
			
			System.out.println("엔터를 누르면 다음난수가 나옵니다.(종료:q)");
			String ent=sc.nextLine();
			if(ent.contentEquals("q")) {
				System.out.println("게임을 종료합니다.");
				break;
				
			}
		}
	
	
	
	
	}

}
