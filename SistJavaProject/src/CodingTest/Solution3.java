package CodingTest;

class So3 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(0<=num1&&num1<=100 && 0<=num2&&num2<=100){
           answer= num1/num2;
        }
        return answer;
    }
}

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(So3.solution(10,4));

	}

}
