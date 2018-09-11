<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h1>글등록</h1>
		<form method="POST" enctype="multipart/form-data"
			  action="${pageContext.request.contextPath }/board/regist.do">
		<input type="text" name="title" /><br/>
		<input type="text" name="writer" /><br/>
		<textarea name="content"></textarea><br/>
		<input type="file" name="attachFile1" />
		<input type="file" name="attachFile2" />
		<input type="submit" value="등록" />
		</form>
	</div>
</body>
</html>