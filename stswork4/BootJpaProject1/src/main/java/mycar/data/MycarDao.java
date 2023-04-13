package mycar.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

@Repository
public class MycarDao {

	@Autowired
	MyCarDaoInter carInter;
	
	//insert
	public void insertCar(MycarDto dto) {
		carInter.save(dto); //id유무에 따라서 자동으로 insert or update
	}
	
	//전체출력
	public List<MycarDto> getAllDatas(){
		
		return carInter.findAll();
	}
	
	public void deleteCar( long num) {
		
		carInter.deleteById(num);;
	}
	//num에 대한 dto반환
	public MycarDto getData(Long num) {
		return carInter.getReferenceById(num);
	}
	//수정
	public void update(MycarDto dto) {
		carInter.save(dto);
	}
}
