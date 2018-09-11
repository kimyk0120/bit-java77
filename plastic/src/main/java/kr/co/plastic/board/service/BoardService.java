package kr.co.plastic.board.service;

import java.util.List;

import kr.co.plastic.board.BoardCommentVO;
import kr.co.plastic.board.BoardFileVO;
import kr.co.plastic.board.BoardVO;
import kr.co.plastic.board.dao.BoardDAO;
import kr.co.plastic.common.SearchAndPageVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	
	public int countBoard() {
		return boardDAO.selectBoardVOCount();
	}
	
	public List<BoardVO> listBoard(SearchAndPageVO page) {
		return boardDAO.selectBoardVOs(page);
	}
	
	public int searchCountBoard(SearchAndPageVO sap) {
		return boardDAO.selectSearchBoardVOCount(sap);
	}
	
	public List<BoardVO> searchListBoard(SearchAndPageVO page) {
		return boardDAO.selectSearchBoardVOs(page);
	}
	
	
	public void insertBoard(BoardVO vo, List<BoardFileVO> fileList) {
		int no = boardDAO.insertBoardVO(vo);
		for(int i=0;i<fileList.size(); i++) {
			BoardFileVO file = fileList.get(i);
			file.setNo(no);
			System.out.println(no);
			boardDAO.insertBoardFileVO(file);
		}
	}
	
	public BoardVO detailBoard(int no) {
		return boardDAO.selectBoardVO(no);
	}
	
	public void deleteBoard(int no) {
		boardDAO.deleteBoardVO(no);
	}
	
	public void updateBoard(BoardVO board) {
		boardDAO.updateBoardVO(board);
	}
	
	public BoardVO beforeBoard(int no) {
		return boardDAO.beforeBoardVO(no);
	}
	
	public BoardVO nextBoard(int no) {
		return boardDAO.nextBoardVO(no);
	}
	
	
	/* 파일 관련 서비스 */
	public List<BoardFileVO> listBoardFile(int no) {
		return boardDAO.selectBoardFileVOs(no);
	}
	
	
	/* 댓글 관련 서비스 */
	public BoardCommentVO insertComment(BoardCommentVO comment) {
		return boardDAO.insertBoardCommentVO(comment);
	}
	
	public List<BoardCommentVO> listBoardComment(int no) {
		return boardDAO.selectBoardCommentVOs(no);
	}
	
	public void deleteComment(BoardCommentVO comment) {
		boardDAO.deleteBoardCommentVO(comment.getCno());
	}
	
	
	public void updateComment(BoardCommentVO comment) {
		boardDAO.updateBoardCommentVO(comment);
	}
	
	
}
