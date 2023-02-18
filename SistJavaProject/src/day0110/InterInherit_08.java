package day0110;

abstract class Game{
	abstract void play();
	abstract void stop();
}

class Dohee extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("도희가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
	System.out.println("도희가 게임을 중단합니다.");
	}
	
}
class Hoon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("훈이가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("훈이가 게임을 중단합니다.");
	}
	
}
class YoungDon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("영돈이가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("영돈이가 게임을 중단합니다.");
	}
	
}


public class InterInherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game[] game = new Game[3]; // 배열선언
		game[0] = new Dohee();
		game[1] = new Hoon();
		game[2] = new YoungDon();
		
		for(int i=0;i<game.length;i++) {
			game[i].play();
		}
		System.out.println("----------------------------");
		for (int i=game.length-1;i>=0;i--) {
			game[i].stop();
		}
	}

}
