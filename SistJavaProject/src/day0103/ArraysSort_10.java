package day0103;

public class ArraysSort_10 {

	public static void main(String[] args) {
		
		//문자열 오름차순 정렬 -> compareTo 활용하면된다.
		
		String data[]= {"이승기","유재석","하하","신민아","송혜교","강호동","노홍철"};
		
		System.out.println("정렬전 출력");
		
		for(int i = 0 ; i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
		
		//오름차순 정렬
		for(int i=0;i<data.length-1;i++) {
			for(int j =i;j<data.length;j++) {
				if(data[i].compareTo(data[j])>0) {
					String temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("정렬된 데이터");
		
		for(int i=0; i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
	}
//a.compareTo(b) 같으먄 0반환, i>j양수 i<j 음수 int 값을 반환
}
