package day0106;

class Info{
	private String name;
	private String blood;
	private int age;
	
	public static void title() {
		System.out.println("이름\t혈액형\t나이");
		System.out.println("=====================");
	}
	
	public Info(String name, String blood, int age) {
		this.name=name;
		this.blood=blood;
		this.age =age;
	
	}
	
	public void write() {
		System.out.println(name+"\t"+blood+"형\t"+age+"세");
	}
	
}



public class ArrayConst_11 {

	public static void main(String[] args) {
		
		Info.title();
		
		Info in[] = {
					new Info("이효리", "A", 29) ,
					new Info("유재석", "B", 39) ,
					new Info("김종국", "O", 49) 
					};
		for (int i=0;i<in.length;i++) {
			in[i].write();
			System.out.println("---------------------");
		}
		
	}

}
