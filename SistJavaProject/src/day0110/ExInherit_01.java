package day0110;

class MySchool{
	
	public static final String SCHOOLNAME="강남고등학교";
	private String schoolAddr;
	private int countStu;
	private int countTeacher;
	
	
	public MySchool() {
		this("송파구",200,15);
	}
	public MySchool(String sAddr, int cStu,int cTea) {
		
		this.schoolAddr = sAddr;
		this.countStu = cStu;
		this.countTeacher=cTea;
		
	}
	public String getSchoolAddr() {
		return schoolAddr;
	}
	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}
	public int getCountStu() {
		return countStu;
	}
	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}
	public int getCountTeacher() {
		return countTeacher;
	}
	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}
	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	//매서드
	public void writeData() {
		System.out.println("학교주소: "+this.schoolAddr);
		System.out.println("학생수: "+this.countStu+"선생님수: "+this.countTeacher);
	}
}

/////////////////////

class MyStudent extends MySchool{
	private String stuName;
	private int score;

	//디폴트생성자_각자맘대로
	public MyStudent() {
		
	}
	//명시적생성자_부모 +자식
	
	public MyStudent(String schoolAddr, int countStu, int countTeacher,String stuName, int score) {
		super(schoolAddr,countStu,countTeacher);
		this.stuName=stuName;
		this.score= score; 
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public void writeData() {
		System.out.println("학교명: "+SCHOOLNAME);
		super.writeData();
		System.out.println("학생명: "+stuName);
		System.out.println("성적 : "+score);
		
	}
	//메서드 오버라이딩
	
}
///////////////////////////////

public class ExInherit_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent s1=new MyStudent();
		MyStudent s2=new MyStudent("영등포",300,20,"유재석",88);
		s1.writeData();
		System.out.println();
		s2.writeData();
		System.out.println();
		System.out.println("1번째의 학생명과 점수변경 후 출력");
		s1.setStuName("김수정");
		s1.setScore(99);
		s1.writeData();
		
	}

}
