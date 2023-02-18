package day0106;

class Score{
	private String stuName;
	private int java;
	private int oracle;
	private int tot;
	private double avg;
	public static final String TITLE ="자바 시험 결과";

	//각각의 setter, getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	//getTot (int)
	public int getTot() {
		return  getJava()+getOracle();
	}
	//getAvg(double)
	public double getAvg() {
		return getTot()/2.0;
	}
	
}


public class QuizTest_06 {

	public static void main(String[] args) {
		System.out.println("Score클래스");
		Score sc =new Score();
		sc.setStuName("지성웅");
		sc.setJava(67);
		sc.setOracle(88);
		System.out.println(sc.TITLE);
		System.out.println("이름"+sc.getStuName());
		System.out.println("자바점수"+sc.getJava());
		System.out.println("오라클점수"+sc.getOracle());
		System.out.println("합계"+sc.getTot());
		System.out.println("평균"+sc.getAvg());
	}

}
