package day0106;

class Shop{
	private String sangpum;
	private int price;
	private String color;

	public Shop(String sangpum, int price, String color) {
		this.sangpum=sangpum;
		this.price=price;
		this.color=color;
	}

	//제목 메서드
	public static void showTitle() {
		System.out.println("상품명\t단가\t색상");
	}
	
//	public void showSangpum(String sangpum, int price ,String color) {
//		this.sangpum=sangpum;
//		this.price=price;
//		this.color=color;
//		
//	}
//	
	//출력메서드
	public void write() {
		System.out.println(sangpum+"\t"+price+"원\t"+color);
	}
}



public class ArrayConst_10 {

	public static void main(String[] args) {
		Shop.showTitle();
		Shop [] sh = {
						new Shop("갤럭시폴더",1200000,"화이트"),
						new Shop("아이폰14",1200000,"그린"),
						new Shop("아이폰 13",1200000,"레드"),
						new Shop("소니폰",1200000,"블랙")};
				
		for (int i=0;i<sh.length;i++) {
			sh[i].write();
			System.out.println("=============");
			
		}
		
		for(Shop s :sh)
			s.write();
		}

	}


