package day0103;

public class ArrayMax_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {5,78,123,87,9,13,35,75,66,33};
		
		System.out.println("개수: " + data.length);
		
		int max = data[0];// 첫 데이터를 무조건 최대값에 저장
		int min = data[0];// 첫 데이터를 무조건 최대값에 저장
		
		//두번째 데이터붜 끝까지 max와 비교
		
		for (int i=1; i<data.length; i++) {
			if(max<data[i]) {
				max=data[i];
			}
			
			if(min>data[i]) {
				min = data[i];
			}
			
		}
		
		System.out.println("최댓값: "+ max);
		System.out.println("최솟값: "+min);
		
	}

}
