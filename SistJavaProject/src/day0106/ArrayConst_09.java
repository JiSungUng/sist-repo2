package day0106;

class MyStuInfo{
	private String stuName;
	private String hp;
	private int score;
	
	public MyStuInfo(String name, String hp, int score) {
	
		this.stuName=name;
		this.hp=hp;
		this.score=score;
		
}

	public void writeData() {
		System.out.println("이름:"+stuName);
		System.out.println("연락처:"+hp);
		System.out.println("점수:"+score);
	}
	
}
public class ArrayConst_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//선언, 할당 ...초기화
//		MyStuInfo stu [] = new MyStuInfo[3];
//		stu[0] = new MyStuInfo("김종이","010-222-3333", 99);
//		stu[1]= new MyStuInfo("안혜원","010-222-3333", 89);
//		stu[2] = new MyStuInfo("지성웅","010-222-3333", 100);
		
		
		//선언,할당과 동시에 초기화
	MyStuInfo [] stu = {
					new MyStuInfo("김종이","010-222-3333", 99),
					new MyStuInfo("안혜원","010-222-3333", 89),
					new MyStuInfo("지성웅","010-222-3333", 100)
			};
		for(int i =0;i<stu.length;i++) {
			stu[i].writeData();
			System.out.println("-------------------");
		}
		//출력 #2
		System.out.println("방법2");
		
		for(MyStuInfo my:stu ) {
			my.writeData();
			System.out.println("=====================");
		}
	
	}
	}


