package day0111;

abstract class AbstEx2{
	abstract public void dataAdd();
	abstract public void dataList();
}

class SubAbst extends AbstEx2{

	@Override
	public void dataAdd() {
		// TODO Auto-generated method stub
		System.out.println("데이타를 추가합니다.");
	}

	@Override
	public void dataList() {
		// TODO Auto-generated method stub
		System.out.println("데이터를 출력합니다.");
	}
	
}


public class AnnoyClass_08 {

		//익명내부클래스 형태
		AbstEx2 ab2 =new AbstEx2() {
			
			@Override
			public void dataList() {
				System.out.println("회원목록 출력");
			}
			@Override
			public void dataAdd() {
				System.out.println("데이타를 출력합니다.");
			}
		};
		
		SubAbst sub =new SubAbst();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnoyClass_08 ex = new AnnoyClass_08();
		
		
		ex.ab2.dataAdd();
		ex.ab2.dataList();
		
		//상속받은 클래스를 멤버변수로 선언
		ex.sub.dataAdd();
		ex.sub.dataList();
	}

}
