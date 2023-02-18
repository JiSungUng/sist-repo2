package day0106;

class Manggo {
	String writer;
	private String subject;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMsg() {
		return msg;
	}
	public static void setMsg(String msg) {
		Manggo.msg = msg;
	}
	private static String msg = "HappyFriday!!";
	
	
	
}




public class ObMethod_07 {

	//Manggo클래스의 변수값을 출력하기위한 메서드
	public static void writeManggo(Manggo m) {
		System.out.println("**망고 클래스 출력***");
		System.out.println("작성자: "+m.getWriter());
		System.out.println("제목: "+m.getSubject());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("망고클래스의 메세지 출력:");
		System.out.println(Manggo.getMsg());
		
		Manggo m1 = new Manggo();
		m1.setWriter("마이클");
		m1.setSubject("오늘은 금요일");
		
		writeManggo(m1);
		Manggo m2 = new Manggo();
		m2.setWriter("제인");
		m2.setSubject("오늘 모임 장소");
		
		writeManggo(m2);
	
	
	
	}

}
