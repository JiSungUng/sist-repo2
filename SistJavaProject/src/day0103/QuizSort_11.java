package day0103;

public class QuizSort_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"이효리","김삼순","진","슈가","유재석"};
		int ages[]= {40,33,27,27,52};
		//이름의 오름차순으로 출력하세요.
		
		
		for(int i=0;i<names.length-1;i++) {
			for(int j=i;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					String temp= names[i];
					names[i]=names[j];
					names[j]=temp;
					int temps =ages[i];
					ages[i]=ages[j];
					ages[j]=temps;
					
				}
			}
		}
		
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<names.length;i++) {
			System.out.println((i+1)+"\t"+names[i]+"\t"+ages[i]);
		}
		
	}

}
