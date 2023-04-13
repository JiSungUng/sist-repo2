package quiz.jshop.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class JpaShopDao {

	@Autowired
	JpaShopDaoInter jpaInter;
	
	//insert
	public void insertJpa(JpaShopDto dto) {
		jpaInter.save(dto);
	}
	
public List<JpaShopDto> getAllDatas(){
		
		return jpaInter.findAll();
	}
	
public JpaShopDto getData(int num) {
		return jpaInter.getReferenceById(num);
	}
	

}
