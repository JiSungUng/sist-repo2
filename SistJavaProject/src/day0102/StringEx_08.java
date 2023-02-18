package day0102;

public class StringEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체에 대한 멤버 메서드 공부하기");
		String str1="apple";
		String str2 ="Apple";
		String str3 ="Have a Nice Day!!!";
		String str4="     Happy Day        ";
		
		
		System.out.println("str의3의 길이: "+str3.length());
		System.out.println("str의4의 길이: "+str4.length());
		System.out.println("앞뒤 공백 제거 후 str의4의 길이: "+str4.trim().length());
		System.out.println("앞뒤 공백 제거 후 str의4: "+str4.trim());

		
		
		System.out.println("str3에서 0번문자. "+str3.charAt(0));
		System.out.println("str3에서 0번문자. "+str3.charAt(7));
	
	
		System.out.println("str3에서 H의 인덱스. "+str3.indexOf('H'));
		System.out.println("str3에서 N의 인덱스. "+str3.indexOf('N'));
		
		
		//subString
		System.out.println("str3에서 Nice 추출: "+str3.substring(7,11));//7~10
		System.out.println("str3에서 Have 추출: "+str3.substring(0,4));//7~10
		System.out.println("str3에  Nice Day 추출: "+str3.substring(7));//7부터 끝까지

		//equals 는 같으면 true, 틀리면 false
		
		System.out.println("문자열 비교:"+str1.equals(str2));
		System.out.println("문자열 비교:"+str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b)
		//a와 b가 같을경우 0
		//a가 작을 경우 -값(알파벳 차이만큼)
		//a가 클 경우  +값

		System.out.println(str1.compareTo(str2)); //a:97 A:65 ->아스키코드
		System.out.println("computer".compareTo("command")); 
		System.out.println("apple".compareTo("banana")); 
		System.out.println("김".compareTo("이"));
		
		//startswith.endwith
		System.out.println(str3.endsWith("Day!!!"));//true
		System.out.println(str3.endsWith("day!!!"));//false
		
		//문자열 분리하는 메서드 split
		String str5="red,blue,yellow,white,gray";
		System.out.println("str5를 컴마(,)로 분리하여 출력하기");
		String arr[]=str5.split(",");
		
		System.out.println("분리된 색상 개수:"+arr.length );
		
		//int ->String
		String a= String.valueOf(100);
		System.out.println(a);
		String a2=100+"";//->> 문자가됨.valueof 생각안날때 이렇게 해도 됨.
		//double-> String
		String b= String.valueOf(12.4);
		
		//문자열의 일부를 변경
		System.out.println(str3.replace('a', '*'));
		System.out.println(str3.replace("Nice", "Wonderful"));
	
	}

}
