package day1227;

public class DataType_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int java = Integer.parseInt(args[0]);
		int jsp = Integer.parseInt(args[1]);
		int spring = Integer.parseInt(args[2]);
		
		int total = java +jsp + spring;
		double avg =  (double)total/3;
		
		System.out.printf("java= %d , jsp=%d, spring = %d\n",java, jsp , spring);
		System.out.println("총점 = "+total);
		System.out.printf("평균 %.2f ",avg);
	}

}
