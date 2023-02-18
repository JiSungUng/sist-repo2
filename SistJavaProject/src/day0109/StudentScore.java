package day0109;


public class StudentScore {
private String name;
private int java;
private int html;
private static String schoolName= "쌍용고등학교";

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getJava() {
	return java;
}
public void setJava(int java) {
	this.java = java;
}
public int getHtml() {
	return html;
}
public void setHtml(int html) {
	this.html = html;
}
public int getTotal() {
	return java+html;
}
public double getAverage() {
	return (double)getTotal()/2;
}
public String getPungga() {
	if(getAverage()>=80) {
		return "합격";
	}
	else
	return "불합격";
}
public static void studentTitle() {
	System.out.println("학교명: "+schoolName);
	System.out.println();
	System.out.println("이름\tJAVA\tHTML\t총점\t평균\t평가");
	
}
public static void writeStu(StudentScore [] st) {
	StudentScore.studentTitle();
	for(StudentScore s:st) {
		System.out.println(s.getName()+"\t"+s.getJava()+"\t"+s.getHtml()+
				"\t"+s.getTotal()+"\t"+s.getAverage()+"\t"+s.getPungga());
	}
}

}
// 명확하게 부모것만 super.