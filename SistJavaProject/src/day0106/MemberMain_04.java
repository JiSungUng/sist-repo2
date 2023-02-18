package day0106;

public class MemberMain_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_04 mem1 = new Member_04();
		Member_04 mem2 = new Member_04();
		Member_04 mem3 = new Member_04();
	
		mem1.setDAta("송중기", "남자","부산");
		mem2.setDAta("최지우","여자","서울시");
		mem3.setDAta("지성웅","남자","여수시");
		
		mem1.writeData();
		mem2.writeData();
		mem3.writeData();
	
	}

}
