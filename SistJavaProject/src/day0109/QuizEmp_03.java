package day0109;

import java.util.Scanner;

class Emp{
	private String name; // 사원명
	private int pay;//급여
	private int famsu;//가족수
	private int timesu;//초과시간근무
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	public int getFamilySudang() {
		int n=0;
		if (famsu>=4) {
			n= 200000;
		}
		else n = famsu*50000;
		
		return n;
	}
	public int getTimeSudang() {
		
		if(timesu>=10) {
			return 300000;
		}
		return timesu *30000;
	}
	public int getTotalPay() {
		
		return pay+getFamilySudang()+getTimeSudang();
	}
	public static void showTitle(){
		
		System.out.println("**우리회사 급여 현황**");
		System.out.println();
		System.out.println("사원명\t급여가족수\t초과시간\t가족수당\t시간수당\t총급여");
		System.out.println("------------------------------------------------------------");
		}
	}

public class QuizEmp_03 {

		public static void writeEmp(Emp[]emp) {
			Emp.showTitle();
			for(Emp e:emp)
			System.out.println(e.getName()+"\t"+e.getPay()+"\t"+
					e.getFamsu()+"\t"+e.getTimesu()+"\t"+e.getFamilySudang()+"\t"
					+e.getTimeSudang()+"\t"+e.getTotalPay());
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inwon;
		
		Emp emp[];
	
		System.out.println("입력할 인원수는?");
		inwon = Integer.parseInt(sc.nextLine());
		
		//배열 할당.
		emp = new Emp[inwon];
		
		for (int i=0;i<inwon;i++) {
			emp[i] = new Emp();
			System.out.println("이름?");
			String name =sc.nextLine();
			System.out.println("급여?");
			int pay = Integer.parseInt(sc.nextLine());
			System.out.println("가족수 입력?");
			int fs = Integer.parseInt(sc.nextLine());
			System.out.println("초과근무시간 입력?");
			int ts = Integer.parseInt(sc.nextLine());
			
			
			
			//setter로 emp 클래스에 데이터 넣기
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamsu(fs);
			emp[i].setTimesu(ts);
			
			System.out.println();
			
					
			
					
		}
		writeEmp(emp);
	}

}
