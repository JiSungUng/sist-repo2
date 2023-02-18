package CodingTest;
class So6 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        
        if (num1 == num2 )
            answer =1;
         if (num1 != num2)
            answer =-1;
        return answer;
    }
}

public class Solution6 {
	public static void main(String args[]) {
		System.out.println(So6.solution(3, 2));
	}
}
