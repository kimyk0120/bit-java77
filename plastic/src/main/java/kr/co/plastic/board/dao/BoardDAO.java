package kr.co.plastic.board.dao;

import java.util.List;

import kr.co.plastic.board.BoardCommentVO;
import kr.co.plastic.board.BoardFileVO;
import kr.co.plastic.board.BoardVO;
import kr.co.plastic.common.SearchAndPageVO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sTmpl;
	
	public int selectBoardVOCount() {
		return sTmpl.selectOne("kr.co.plastic.board.dao.BoardDAO.selectBoardVOCount");
	}
	
	public List<BoardVO> selectBoardVOs(SearchAndPageVO page) {
		return sTmpl.selectList(
				"kr.co.plastic.board.dao.BoardDAO.selectBoardVOs", page);
	}
	
	public int selectSearchBoardVOCount(SearchAndPageVO sap) {
		return sTmpl.selectOne(
				"kr.co.plastic.board.dao.BoardDAO.selectSearchBoardVOCount", sap);
	}
	
	public List<BoardVO> selectSearchBoardVOs(SearchAndPageVO page) {
		return sTmpl.selectList(
				"kr.co.plastic.board.dao.BoardDAO.selectSearchBoardVOs", page);
	}
	
	
	public int insertBoardVO(BoardVO vo) {
		sTmpl.insert(
				"kr.co.plastic.board.dao.BoardDAO.insertBoardVO", vo);
		return vo.getNo(); 
	}
	
	public BoardVO selectBoardVO(int no) {
		return sTmpl.selectOne(
				"kr.co.plastic.board.dao.BoardDAO.selectBoardVO", no);
	}
	
	public void deleteBoardVO(int no) {
		sTmpl.delete("kr.co.plastic.board.dao.BoardDAO.deleteBoardVO", no);
	}
	
	public void updateBoardVO(BoardVO board) {
		sTmpl.update("kr.co.plastic.board.dao.BoardDAO.updateBoardVO", board);
	}
	
	public BoardVO beforeBoardVO(int no) {
		return sTmpl.selectOne("kr.co.plastic.board.dao.BoardDAO.beforeBoardVO", no);
	}
	
	public BoardVO nextBoardVO(int no) {
		return sTmpl.selectOne("kr.co.plastic.board.dao.BoardDAO.nextBoardVO", no);
	}
	
	
	/**
	 * 
	 * 파일 관련 DAO
	 * @param file
	 */
	public void insertBoardFileVO(BoardFileVO file) {
		sTmpl.update(
				"kr.co.plastic.board.dao.BoardDAO.insertBoardFileVO", file);
	}
	
	public List<BoardFileVO> selectBoardFileVOs(int no) {
		return sTmpl.selectList(
				"kr.co.plastic.board.dao.BoardDAO.selectBoardFileVOs", no);
	}
	
	
	/**
	 * 
	 * 댓글 관련 DAO
	 */
	public List<BoardCommentVO> selectBoardCommentVOs(int no) {
		return sTmpl.selectList(
				"kr.co.plastic.board.dao.BoardDAO.selectBoardCommentVOs", no);
	}
	
	public BoardCommentVO insertBoardCommentVO(BoardCommentVO comment) {
		sTmpl.insert(
				"kr.co.plastic.board.dao.BoardDAO.insertBoardCommentVO", comment);
		return comment;
	}
	
	public void deleteBoardCommentVO(int cno) {
		sTmpl.delete(
				"kr.co.plastic.board.dao.BoardDAO.deleteBoardCommentVO", cno);
	}
	
	public void updateBoardCommentVO(BoardCommentVO comment) {
		sTmpl.update(
				"kr.co.plastic.board.dao.BoardDAO.updateBoardCommentVO", comment);
	}
}
