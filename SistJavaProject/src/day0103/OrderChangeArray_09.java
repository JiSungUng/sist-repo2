package day0103;

import java.util.Arrays;

public class OrderChangeArray_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {5,7,9,13,56,4,77,88,99,11};
		System.out.println("원 데이터 출력");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("데이터 거꾸로 변경하기");
		
		for(int i=0; i<arr.length/2;i++) {
			
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			
		}
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("데이터를 오름차순으로 변경하기"); // 중첩 for문 이용.
		//기준데이터는 0번부터 끝에서 두번째 까지
		for(int i=0;i<arr.length-1;i++) {
			
			//비교하는 데이터는 기준다음값부터 끝까지
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
				
		}
			
			}
//		Arrays.sort(arr);// 배열 arr 을 정렬한다.
		
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}

}
