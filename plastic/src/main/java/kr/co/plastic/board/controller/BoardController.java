package kr.co.plastic.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.plastic.board.BoardCommentVO;
import kr.co.plastic.board.BoardFileVO;
import kr.co.plastic.board.BoardVO;
import kr.co.plastic.board.service.BoardService;
import kr.co.plastic.common.SearchAndPageVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private ServletContext servletContext;
	
	/**
	 * 글 목록 조회
	 * @return
	 */
	@RequestMapping("/list.do")
	public ModelAndView list(@RequestParam(defaultValue="1") int page, Model model) {
		int size = 10;
		SearchAndPageVO pageObj = new SearchAndPageVO();
		pageObj.setStart((page-1)*size+1);
		pageObj.setEnd(page*size);
		
		List<BoardVO> board = boardService.listBoard(pageObj);
		int maxCount = boardService.countBoard();
		
		int lastPage = (maxCount-1)/size+1;
		int currStartPage = ((page-1)/size)*size+1;
		int currLastPage = currStartPage+size-1;
		if(currLastPage>lastPage) {
			currLastPage = lastPage;
		}
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("board", board);
		mav.addObject("currStartPage", currStartPage);
		mav.addObject("currLastPage", currLastPage);
		mav.addObject("lastPage", lastPage);
		mav.addObject("currPage", page);
		return mav;
	}
	
	
	/**
	 * 
	 * 글 검색
	 */
	@RequestMapping(value="/search.do") 
	public ModelAndView search(@RequestParam String sColumn, 
						 @RequestParam String search,
						 @RequestParam(defaultValue="1") int page)	{
		
		int size = 10;
		int start = (page-1)*size+1;
		int end = page*size;
		
		SearchAndPageVO sap = new SearchAndPageVO();
		sap.setStart(start);
		sap.setEnd(end);
		sap.setColumn(sColumn);
		sap.setSearch(search);
		
		List<BoardVO> board = boardService.searchListBoard(sap);
		int maxCount = boardService.searchCountBoard(sap);
		
		int lastPage = (maxCount-1)/size+1;
		int currStartPage = ((page-1)/size)*size+1;
		int currLastPage = currStartPage+size-1;
		if(currLastPage>lastPage) {
			currLastPage = lastPage;
		}
		ModelAndView mav = new ModelAndView("board/search");
		mav.addObject("board", board);
		mav.addObject("currStartPage", currStartPage);
		mav.addObject("currLastPage", currLastPage);
		mav.addObject("lastPage", lastPage);
		mav.addObject("currPage", page);
		
		return mav;
	}
	
	/**
	 * 
	 * 글 등록 GET 요청
	 * @return
	 */
	@RequestMapping(value="/regist.do", method=RequestMethod.GET)
	public String registGet() {
		return "board/registForm";
	}
	
	
	/**
	 * 
	 * 글 등록 POST 요청 (DB에 게시글 insert)
	 * @param boardVO
	 * @return
	 */
	@RequestMapping(value="/regist.do", method=RequestMethod.POST)
	public String registPost(MultipartHttpServletRequest mRequest, 
				RedirectAttributes redirectAttributes) throws Exception {
		String uploadDir = servletContext.getRealPath("/upload/");
		SimpleDateFormat pathFormat = new SimpleDateFormat("yyyy/MM/dd/");
		String detailPath = pathFormat.format(new Date());
		uploadDir += detailPath;
		File pathFile = new File(uploadDir);
		System.out.println(uploadDir);
		pathFile.mkdirs();
		
		BoardVO board = new BoardVO();
		
		String title = mRequest.getParameter("title");
		String writer = mRequest.getParameter("writer");
		String content = mRequest.getParameter("content");
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);

		ArrayList<BoardFileVO> fileList = new ArrayList<BoardFileVO>();
		
		Iterator<String> files = mRequest.getFileNames();
		while(files.hasNext()) {
			String fileName = files.next();
			
			MultipartFile mFile = mRequest.getFile(fileName);
			
			String oriFileName = mFile.getOriginalFilename();
			if(oriFileName != null && !oriFileName.equals("")) {
				BoardFileVO file = new BoardFileVO();
				
				String ext = "";
				int idx = oriFileName.lastIndexOf(".");
				if(idx != -1) {
					ext = oriFileName.substring(idx);
				}
				
				long fileSize = mFile.getSize();
				String saveFileName = "plastic-" + UUID.randomUUID().toString() + ext;
				
				mFile.transferTo(new File(uploadDir + "/" +saveFileName));
				
				file.setOriFileName(oriFileName);
				file.setRealFileName(saveFileName);
				file.setFilePath(detailPath);
				file.setFileSize(fileSize);
				fileList.add(file);
			}
		}
		
		boardService.insertBoard(board, fileList);
		
		redirectAttributes.addFlashAttribute("msg", "게시글이 등록되었습니다!");
		
		return "redirect:/board/list.do";
	}
	
	/**
	 * 
	 * 글 조회
	 * 
	 */
	@RequestMapping("/detail.do")
	public ModelAndView detail(@RequestParam int no) {
		BoardVO board = boardService.detailBoard(no);
		List<BoardFileVO> fileList = boardService.listBoardFile(no);
		List<BoardCommentVO> commentList = boardService.listBoardComment(no);
		BoardVO before = boardService.beforeBoard(no);
		BoardVO next = boardService.nextBoard(no);
		
		ModelAndView mav = new ModelAndView("board/detail");
		mav.addObject("board", board);
		mav.addObject("fileList", fileList);
		mav.addObject("commentList", commentList);
		mav.addObject("before",before);
		mav.addObject("next", next);
		
		return mav;
	}
	
	/**
	 * 글삭제
	 */
	@RequestMapping("/delete.do")
	public String delete(@RequestParam int no, RedirectAttributes redirectAttributes) {
		boardService.deleteBoard(no);
		redirectAttributes.addFlashAttribute("msg", "글이 삭제되었습니다!");
		return "redirect:/board/list.do";
	}
	
	/**
	 * 
	 * 글수정 GET요청 (updateForm으로 이동)
	 */
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public ModelAndView updateGet(@RequestParam int no) {
		BoardVO board = boardService.detailBoard(no);
		ModelAndView mav = new ModelAndView("board/updateForm");
		mav.addObject("board", board);
		return mav;
	}
	
	/**
	 * 
	 * 글수정 POST요청 (DB에 수정요청)
	 */
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String updatePost(@ModelAttribute("board") BoardVO board, Model model) {
		boardService.updateBoard(board);
		model.addAttribute("msg", "글이 수정되었습니다!");
		return "board/detail";
	}
	
	
	
	
	
	/* 댓글 관련 Controller	 */
	
	
	/**
	 * 
	 * 댓글 등록
	 */
	
	
	@RequestMapping(value="/commentRegist.json", method=RequestMethod.POST)
	@ResponseBody
	public BoardCommentVO commentRegist(BoardCommentVO comment) {
		return  boardService.insertComment(comment);
	}
	
	@RequestMapping("/commentDelete.json")
	@ResponseBody
	public void commentDelete(BoardCommentVO comment) {
		boardService.deleteComment(comment);
	}
	
	@RequestMapping(value="/commentUpdate.json", method=RequestMethod.POST)
	@ResponseBody
	public void commentUpdate(BoardCommentVO comment) {
		boardService.updateComment(comment);
	}
	
	
}
