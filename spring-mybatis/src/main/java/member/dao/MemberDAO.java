package member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<MemberVO> selectMember() throws Exception {
		return sqlSessionTemplate.selectList("member.dao.MemberDAO.getMemberList");
	}
	
	public MemberVO selectMemberById(String id) throws Exception {
		return sqlSessionTemplate.selectOne("member.dao.MemberDAO.getMemberInfo", id);
	}
	
	public void insertMember(MemberVO member) throws Exception {
		sqlSessionTemplate.insert("member.dao.MemberDAO.insertMember", member);
	}
	
	public void updateMember(MemberVO member) throws Exception {
		sqlSessionTemplate.update("member.dao.MemberDAO.updateMember", member);
	}
	
}
