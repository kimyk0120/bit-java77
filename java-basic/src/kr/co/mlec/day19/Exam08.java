package kr.co.mlec.day19;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Exam08 {
	public static void main(String[] args) {
		try {
			String blogAddr = "https://apis.daum.net/search/blog"
					+ "?apikey=f1fe1ade01115b09c6f078e3f1d1e50b"
					+ "&q="+URLEncoder.encode("������","UTF-8")
					+ "&output=xml";
			URL url = new URL(blogAddr);
			InputStream in = url.openStream();
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			Document doc = builder.parse(in);
			NodeList list = doc.getElementsByTagName("item");
			
			ArrayList<BlogVO> blogList = new ArrayList<>();
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				NodeList cList = node.getChildNodes();
				
				BlogVO blog = new BlogVO();
				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					if (name.equals("#text"))
						continue;
					String value = cNode.getTextContent();
					switch(name)
					{
					case "title": blog.setTitle(value);
					break;
					case "description": blog.setDescription(value);
					break;
					case "link": blog.setLink(value);
					break;
					case "author": blog.setAuthor(value);
					break;
					case "comment": blog.setComment(value);
					break;
					case "pubDate": blog.setPubDate(value);
					break;
					}
					
				}
				blogList.add(blog);
			}

			// ���� ����
			String path = "src/kr/co/mlec/day19/blog.html";
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<meta chUTF-8'EUC-KR'>");
			pw.println("<title>��α� �˻����</title>");
			pw.println("<style>");
			pw.println("body{text-size:13px;}");
			pw.println("h1{text-align:center; font-size:20px;}");
			pw.println("table,th,td{border: 1px solid tomato;}");
			pw.println("table{width:90%;border-collapse:collapse;}");
			pw.println("th{background:green;color:white}");
			pw.println("th, td{height:50px;}");
			pw.println("td{padding:5px;}");
			pw.println("tr:hover{background:red;color:white;}");
			pw.println("</style>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<h1>������ ��α� �˻� ���</h1>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<th>��α׸�</th>");
			pw.println("<th>����</th>");
			pw.println("<th>����Ͻ�</th>");
			pw.println("</tr>");
			
			for(BlogVO blog : blogList){
				pw.println("<tr>");
				pw.println("<td>"+blog.getAuthor()+"</td>");
				pw.println("<td><a href='" + blog.getLink() + "'>"+blog.getTitle()+"</a></td>");
				pw.println("<td>"+blog.getPubDate()+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("</body>");
			pw.println("</html>");
			pw.close();
			fw.close();
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		}
	}
}
