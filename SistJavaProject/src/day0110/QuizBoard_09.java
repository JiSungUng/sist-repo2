package day0110;

import java.util.Scanner;

interface Command{
	public void write();
}

class Insert implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 Insert합니다.");
	}
	
}

class Select implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판을 Select합니다.");
	}
	
}

class Update1 implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판을 Update합니다.");
	}
	
}
class Delete1 implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판을 Delete합니다.");
	}

}


public class QuizBoard_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Command comm =null;
		int n;
		while(true) {
			System.out.println("[메뉴] 1.추가 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("====================================");
			System.out.print("-->");
			n= sc.nextInt();
			switch(n) {
			case 1:
				comm=new Insert();
				break;
			case 2:
				comm= new Update1();
				break;
			case 3:
				comm =new Delete1();
				break;
			case 4:
				comm=new Select();
				break;
			case 5:
				System.exit(0);
				
			}
				if(n<=4)
					comm.write();
		}
	}

}
