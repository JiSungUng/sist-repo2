package day0102;

public class ArrayTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언, 기본현배열은 객체로 인식.
		// int [] arr=new int[3];
		int[] arr, arr2;// 배열 선언
		arr = new int[3]; // 메모리 할당
		arr2 = new int[5]; // 초기값을 안주더라도 할당만 일단 하게되면 0으로 초기화됨.
		
		// 배열에 값을 넣는다. -> 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		// 개수, 출력
		System.out.println("배열 arr의 개수" + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("==========================");
		// 출력문 #2 for~each문

		for (int a : arr) // for(자료형 변수명:배열명
		{
			System.out.println(a);
		}

		// arr2에 초기화를 하지않고 출력해보기
		
		
		arr2[0]=10;
		arr2[1]=20;
		arr2[2]=30;
		arr2[3]=40;
		arr2[4]=50;

		System.out.println("arr2배열의 개수: " + arr2.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + "->" + "arr2 =" + arr2[i]);
		}

		for (int b : arr2) {
			System.out.println(b);
		}

	}

}
