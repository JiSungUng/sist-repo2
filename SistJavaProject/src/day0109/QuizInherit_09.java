package day0109;

//super
class Shop{
	/*Shop - sangpum , su pivate
	 * 디폴트 생성자에서 "딸기" , 5
	 * 명시적 생성자 :멤버변수에 전달.
	 * 
	 * 출력은 writeShop() 에서 출력
	 * */
	private  String sangpum;
	private int su;
	
	public Shop() {
		sangpum ="딸기";
		su= 5;
	}
	public Shop(String sangpum,int su) {
		System.out.println("super_인자있는 생성자");
		this.sangpum =sangpum;
		this.su =su;
				
	}
	
	public void write() {
		System.out.println("상품명:"+this.sangpum);
		System.out.println("수량:"+this.su);
	}
}
//sub

class MySangPum extends Shop{
	/*price private
	 * 디폴트 생성자 :1000
	 * 3개 인자 받는 생성자 만든 후 상품명, 수량은 부모생성자로 전달.
	 * writeShop() 오버라이드 한 후 상품명 ,수량 단가 출력*/
	private int price;
	public MySangPum() {
		price =1000;
	}
	public MySangPum(String sangpum, int su, int pirice) {
		super(sangpum,su);
		this.price=price;
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("단가: "+price);
		super.write();
	}
}

public class QuizInherit_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*객체를 2개 생성
		 * 디폴트로 생성, 인자보내서 생성 후 모두 출력하기
		 * 
		 * 단가 :1000
		 * 상품명 :딸기
		 * 수량 5
		 * 
		 * 단가 :1200
		 * 상품명 :오렌지
		 * 수량 :10*/

		MySangPum ms1= new MySangPum();
		ms1.write();
		MySangPum ms2= new MySangPum("오렌지",10,1200);
		ms2.write();
	}

}
