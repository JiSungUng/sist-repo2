package day0110;
interface InterAA{
	public void order();
}
interface InterBB{
	public void baedal();
	public void pungga();
}

class InterImpl2 implements InterAA,InterBB{

	@Override
	public void baedal() {
		// TODO Auto-generated method stub
		System.out.println("배달을갑니다.");
	}

	@Override
	public void pungga() {
		// TODO Auto-generated method stub
		System.out.println("평가를합니다.");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문을합니다.");
	}
	
}

public class QuizInter_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객채생성
		InterImpl2 inter =new InterImpl2();
		inter.baedal();
		inter.pungga();
		inter.order();
		System.out.println("-------------------------");
		InterAA ina =new InterImpl2();
		ina.order();
		
		InterBB inb =new InterImpl2();
		inb.pungga();
		inb.baedal();
		
	}

}
