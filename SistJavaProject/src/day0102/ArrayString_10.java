package day0102;

public class ArrayString_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str;  //선언
		str=new String [4]; // 생성
		
		
		//초기화
		
		str[0]="주하랑";
		str[1]="성한경";
		str[2]="최보현";
		str[3]="지성웅";
		
		//출력
		
		for(int i=0;i<str.length;i++) {
			System.out.println(i+":"+str[i]);
		}
		
		
		System.out.println("--------------");
		for(String a:str) {
			System.out.println("출력2:"+a);
		}
		
		System.out.println("--------------");
		
		//선언하면서 초기값들을 한번에 지정
		int [] arr= {7,12,34,99,23}; // 5개 할당과 동시에 0~4번지까지 값 할당.!
		String[] colors= {"red","yello","white","gray","black"};
		
		
		
		System.out.println("arr의 길이: "+arr.length);
		System.out.println("arr출력 1");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번째: " + arr[i]);
		}
		System.out.println("==============");
		System.out.println("arr출력 2");
		
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println("==============");
		System.out.println("colors의 길이: "+colors.length);
		System.out.println("colors출력 1");
				for(int i=0;i<colors.length;i++) {
					System.out.println(i+"번째: "+colors[i]);
				}
				
				System.out.println("==============");
				System.out.println("colors출력 2");
				
				for(String b:colors) {
					System.out.println(b);
				}
		
		
		
		
		
	}

}
