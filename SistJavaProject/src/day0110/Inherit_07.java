package day0110;

interface Color{
	String INITCOLOR ="white";
	public void showColor();
}
	class Red implements Color{
		
		
		@Override
		public void showColor() {
			// TODO Auto-generated method stub
			System.out.println("Red-showColor");
			System.out.println("현재색상: "+INITCOLOR);
		}
	}
	
	class Blue implements Color{

		@Override
		public void showColor() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Green implements Color{

		@Override
		public void showColor() {
			// TODO Auto-generated method stub
			
		}
		
	}

public class Inherit_07 {
	public static void show(Color color) {
		color.showColor();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(new Red());
		show(new Blue());
		show(new Green());
		
		
		
		//다형성
//		Color color;
//		color =new Red();
//		color.showColor();
//		color =new Green();
//		color.showColor();
//		color =new Blue();
//		color.showColor();
		
	}

}


