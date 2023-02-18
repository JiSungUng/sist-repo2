package day0112;

import java.util.StringTokenizer;

public class ExToken_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 특정기호로 분리하는 방법들
		String str = "red,blue,yellow,pink,white,cyan";
		System.out.println("String 객체의 split을 이용한 분리");
		String arr[] = str.split(",");
		System.out.println("총" + arr.length + "개");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ":" + arr[i]);

		}
		System.out.println("StringTokenizer를 이용한 분리");
		StringTokenizer st = new StringTokenizer(str, ","); //..어떤 기호를 기준으로 짜낸다?
		System.out.println("총 토큰 수:"+st.countTokens());
		
		while(st.hasMoreTokens()) {//다음토큰이 있으면 true 없으면 false..
			System.out.println(st.nextToken());// 다음토큰 얻기
		}
		}
}