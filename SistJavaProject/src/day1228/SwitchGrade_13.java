package day1228;

public class SwitchGrade_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
		char grade;
		
		switch (score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade ='B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade ='D';

		default:
			grade ='F';
			break;
		}
		System.out.println("학점은 "+grade+"입니다.");
	}

}
