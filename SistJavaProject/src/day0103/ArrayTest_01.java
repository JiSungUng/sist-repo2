package day0103;

public class ArrayTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[5];
		arr1[1] = 10;
		arr1[4] = 34;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + "는" + arr1[i]);
		}

		System.out.println("============");
		for (int a : arr1) {
			System.out.println(a);
		}

		// 선언과 동시에 초기화

		int arr[] = { 23, 35, 64, 22, 33, 66 };
		System.out.println("배열개수:" + arr.length);
		System.out.println("----1_출력----");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
		System.out.println();
		System.out.println("---------");
		for (int b : arr) {
			System.out.printf("%5d", b);
		}

	}

}
