<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>plastic</title>
<link href="${pageContext.request.contextPath }/css/global.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/js/jquery-1.11.2.js"></script>

</head>
<body>
	<div class="wrap">
		<form method="POST" action="${pageContext.request.contextPath }/board/update.do">
			번호 : <input type="text" value="${board.no }" name="no" readonly /><br/>
			제목 : <input type="text" value="${board.title }" name="title"/><br/>
			작성자 : <input type="text" value="${board.writer }" name="writer" readonly /><br/>
			작성일 : <input type="text" value="<fmt:formatDate value='${board.regDate }' pattern='yyyy-MM-dd'/>" readonly /><br/>
			내용 : <br/>
			<textarea name="content"><c:out value="${board.content }"/></textarea> <br/>
			<input type="submit" value="수정" />
		</form>
	</div>
</body>
</html>