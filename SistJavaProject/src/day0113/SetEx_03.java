package day0113;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set,Random 이용해서 난수발생 (1~45) 6개출력
		Random r= new Random();
		Set<Integer> set =new HashSet<>();
		
		while(true) {
			int n=r.nextInt(45)+1;
			set.add(n);
			
			if(set.size()==6) {
				break;
			}
		}
		System.out.println("출력 #1");
		for(Integer num :set) {
			System.out.printf("%4d",num);
		}
		System.out.println();
		System.out.println("정렬후 출려 #2");
		Object[]ob = set.toArray();
		Arrays.sort(ob);
		
		for(int i = 0;i<ob.length;i++) {
			System.out.printf("%4d",ob[i]);
		}
		System.out.println();
		
	}

}
