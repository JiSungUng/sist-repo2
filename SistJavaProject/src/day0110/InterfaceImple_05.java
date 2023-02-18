package day0110;

interface InterA{
	public void write();
	public void draw();
	
}
//////////////////////////////////
interface InterB extends InterA {
	public void play();
	
}
///////////////////////////////// 2개의 interface를 구현한 클래스
class InterImpl implements InterB{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("나는 숙제를 합니다.");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("나는 그림을 그린다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("나는 축구를 합니다.");
	}

	
	
}

///////////////////////////////
public class InterfaceImple_05 {

	public static void main(String[] args) {
		//1. 서브클래스 이용하여 객체 생성
		
		
		InterImpl inter1= new InterImpl();
		inter1.write();
		inter1.draw();
		inter1.play();
		
		System.out.println("--------------------------------");
		//2. 다형성호출
		InterA inA=new InterImpl();
		inA.draw();
		inA.write();
		InterB inB =new InterImpl();
		inB.draw();
		inB.play();
		inB.write();
	
	}

}
