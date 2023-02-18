package day0113;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_08 {

		List<Board> list =new Vector<>();
		//클래스형으로 지정했으므로 데이터를 꺼내고 받을때도 클래스
	
		public void inputData() {
			Scanner sc =new Scanner(System.in);
			String writer,subject,content;
			
			System.out.println("작성자명");
			writer =sc.nextLine();
			System.out.println("제목");
			subject =sc.nextLine();
			System.out.println("내용");
			content =sc.nextLine();
			
			
			Board data =new Board(writer, subject, content);
			list.add(data);
			
			System.out.println("현재 데이터 개수: "+list.size()+"개");
		}
		public void wrtieData() {
			System.out.println("**게시판**");
			System.out.println("==========================================");
			
			for(int i =0;i<list.size();i++) {
				Board b= list.get(i); //리스트내의 지정된 위치에 있는 요소를 돌려준다.
				
				System.out.println("No."+(i+1)+"\n작성자: "+b.getWriter());
				System.out.println("제목: "+b.getSubject());
				System.out.println("내용: "+b.getContent());
				System.out.println("=============================================");
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VectorBoard_08 vb =new VectorBoard_08();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1.추가    2.전체출력    9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				vb.inputData();
			else if(n==2)
				vb.wrtieData();
			else if(n==9) {
				System.out.println("**종료합니다.**");
				break;
			}
		}
	}

}
