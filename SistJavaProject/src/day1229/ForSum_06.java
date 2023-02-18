package day1229;

public class ForSum_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=10;i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("/1부터 10까지의 합은 "+sum+"입니다.");
	
	
		int a=1;
		int tot =0;
		
		while(a<=10) {
			tot= tot +a;
			a++;
		}
	System.out.println(tot);

	
	int total = 0;
	for(int n=1;n<=10;n+=2) {
		total+=n;
	}
	System.out.println(total);
	}
		
}
