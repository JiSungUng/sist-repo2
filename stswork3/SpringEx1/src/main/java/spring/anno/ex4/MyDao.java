package spring.anno.ex4;

import org.springframework.stereotype.Component;

@Component //ù�� �ҹ��ڷ� �ٲ�
public class MyDao implements DaoInter {
	

	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+"_����Ÿ�� db�� �߰�����!");
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub
		System.out.println(num+"_�� �ش��ϴ� ����Ÿ ���� ����!!!");

	}

}