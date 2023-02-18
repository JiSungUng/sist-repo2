package CodingTest;

class Solution {
	public static int solution(int age) {

		int answer = 0;
		answer = 2022 - age + 1;

		return answer;

	}
}

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		
		System.out.println(so.solution(4));
	}

}
