package boot.data.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import boot.data.dto.BoardDto;

public interface BoardServiceInter {

	public int getTotalCount();
	public void updatereadCount(String num);
	public BoardDto getData(String num);
	public int getMaxNum();
	public List<BoardDto> getlist(int start, int perpage);
	public void insertBoard(BoardDto dto);
	
}
