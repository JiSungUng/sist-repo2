package spring.anno.ex6;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManggoController {

//	@Autowired //error:��Ī�� manggo ������ 2���� ������
	//�������̽� Manggo�� ������ Ŭ������ pmanggo �Ѱ��� ���� �ڵ������� �Ǵµ� 
	//���� ������ Ŭ������ �������� ���� ��쿡�� �ڵ����Կ� ������ �߻��Ѵ�.
	//��Ȯ�� bean�� �̸����� �����Ϸ��� @REsource(name="��Ȯ���̸�")

	
	//@Resource(name="pmanggo")
	@Resource(name="taiwanmanggo")
	Manggo manggo;
	
	public void writeManggo() {
		System.out.println("���� �����ϴ� ������ **");
		manggo.writeManngoName();
	}
}
