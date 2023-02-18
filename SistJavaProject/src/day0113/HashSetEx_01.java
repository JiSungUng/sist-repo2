package day0113;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx_01 {
/*컬렉션: 자료구조(set,vector, list, map)
 * 제네릭: 명시한 자료형
 * 
 * 작성법
 * (인터페이스 or 클래스) <데이터형> 객체이름 =new 클래스명<데이터형>
 * 컬렉션 _ 가변적크기, 배열은 고정
 * 
 *  Set: 유일성이 중요할때 즉, 중복을허용하지 않는다. 순서는 안지켜짐 ,인덱스 없음
 *  List: 순서가 중요할때, 인덱스 위치를 알고있다. 중복가능
 *  Map: <key>값을 가지고<value>를 찾고자할때 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 =new HashSet<>();
		//Set 컬렉션구조안에 String 데이타를 담겠다_Set은 인터페이스이므로 객체생성 안됨
		
		set1.add("사과");
		set1.add("배");
		set1.add("사과");//사과는 중복되므로 개수에 포함되지 않음.
		set1.add("오렌지");
		set1.add("바나나");
		set1.add("키위");
		
		System.out.println("데이터 개수: "+set1.size());
		
		//출력할때 iterator 를 얻은다음 반복문,주로 while문 읽어온다.
		
		System.out.println("출력 #1");
		for(String s : set1)
			System.out.println(s);
		System.out.println();
		System.out.println("출력 #2");
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //데이터가더이상 없으면 false 반환
			String s= iter.next();
			System.out.println(s);
		}
		System.out.println();
		System.out.println("출력 #3");
		Object[] ob =set1.toArray();
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}
		
		
		set1.clear();
		//모든데이터 삭제
		if(set1.isEmpty()) {
			System.out.println("Set타입안에 데이터가 없다.");
		}else
			System.out.println("Set타입안에 데이터가 있다.");
			
		
	}

}
