package kr.co.plastic.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FileDownController {
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping(value="/down.do", method=RequestMethod.GET)
	public void fileDown(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String realPath = servletContext.getRealPath("/upload/");
		String path = req.getParameter("path");
		String realFileName = req.getParameter("rName");
		String oriFileName = req.getParameter("oName");
		File file = new File(realPath + path + realFileName);
		
		res.setHeader("Content-Type", "application/octet-stream");
		res.setHeader("Content-Disposition", "attachment;filename="+ new String(oriFileName.getBytes("UTF-8"),"8859_1"));
		res.setHeader("Content-Transfer-Encoding", "binary;");
		res.setHeader("Content-Length", String.valueOf(file.length()));
		res.setHeader("Pragma", "no-cache;");
		res.setHeader("Expires", "-1;");
		
		if(file.isFile()) {
			BufferedInputStream bis = new BufferedInputStream(
								new FileInputStream(file));
			
			BufferedOutputStream bos = new BufferedOutputStream(
								res.getOutputStream());
			
			while(true) {
				int ch = bis.read();
				if(ch==-1) {
					break;
				}
				bos.write(ch);
			}
			
			bis.close();
			bos.close();
		}
	}

}
