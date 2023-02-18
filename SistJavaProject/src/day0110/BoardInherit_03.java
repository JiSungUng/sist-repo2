package day0110;

import java.util.Scanner;

//super
abstract class Board{
	abstract public void process();
}
///////////////////////
class List extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 전체글을 출력합니다.");
		
	}
	
}
/////////////////////////////////
	class Write extends Board{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 글을 쓰고 저장합니다.");
	}
		
	}

	class Update extends Board{

		@Override
		public void process() {
			// TODO Auto-generated method stub
			System.out.println("게시판의 글을 수정합니다.");
		}
		
	}
	///////////////////////////////////////////////
	class Delete extends Board{

		@Override
		public void process() {
			// TODO Auto-generated method stub
			System.out.println("게시판의 글을 삭제합니다.");
		}
		
	}
	////////////////////////////////
public class BoardInherit_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Scanner sc = new Scanner(System.in);
			int num;
			Board board =null;
			while(true) {
				System.out.println("1.쓰기 2. 글출력 3. 수정 4. 삭제 5. 종료");
			num= sc.nextInt();
			
			switch(num) {
			case 1:
				board = new Write();
				break;
			case 2:
				board = new List();
				break;
			case 3:
				board = new Update();
				break;
			case 4:
				board = new Delete();
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
				
			}
				board.process();
			}
				
	}

}
