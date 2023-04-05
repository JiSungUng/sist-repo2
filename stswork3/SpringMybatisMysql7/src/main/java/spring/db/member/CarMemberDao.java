package spring.db.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.db.car.MyCarDto;



@Repository
public class CarMemberDao {
	@Autowired
	private SqlSession session;
	
	//�Ѱ���
		public int getTotalCount() {
			
			return session.selectOne("getTotalCountOfMember");
		}
		
		public List<CarMemberDto> getAllDatas() {
			
			return session.selectList("getAllDatasOfCarMember");
		}
		
		//insert
		public void insertCarMember(CarMemberDto dto) {
			
			session.insert("insertOfCarMember",dto);//id,�Ķ��Ÿ
		}
		//������
		public CarMemberDto getData(String num) {
			
			return session.selectOne("getOneDataOfCarMember", num);
		}
		
		//���� 
		public void updateCarMember(CarMemberDto dto) {
			
			session.update("updateOfCarMember", dto);
		}
		//����
		public void deleteCarMember(String num) {
			session.delete("deleteOfCarMember",num);
		}
		
}
