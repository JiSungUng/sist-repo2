package boot.data.service;

import java.util.List;
import java.util.Map;

import boot.data.dto.MemberDto;

public interface MemberServiceInteer {

	public List<MemberDto> getAllMembers();
	public void insertMember(MemberDto dto);
	public int getSearchId(String id);
	public String getName(String id);
	public int loginIdPassCheck(String id,String pass);
	public MemberDto getDataById(String id);
	
	
}
