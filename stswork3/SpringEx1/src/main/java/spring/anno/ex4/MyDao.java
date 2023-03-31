package spring.anno.ex4;

import org.springframework.stereotype.Component;

@Component //첫자 소문자로 바뀜
public class MyDao implements DaoInter {
	

	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+"_데이타를 db에 추가성공!");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println(num+"_에 해당하는 데이타 삭제 성공!!!");

	}

}
