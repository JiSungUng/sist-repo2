package data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.dto.BookDto;

@Mapper
public interface BookMapperInter {

	public void insertBook(BookDto dto);
	public List<BookDto> getAllDatas();
}
