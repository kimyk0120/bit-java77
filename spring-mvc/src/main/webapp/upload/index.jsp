<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath() %>/hello/hello.do"> hello </a><br />
	<a href="<%=request.getContextPath() %>/method/method.do"> method </a><br />
	<a href="<%=request.getContextPath() %>/form/joinForm.do"> form </a><br />
	<a href="<%=request.getContextPath() %>/ajax/resBody.do"> ���ڿ� ���� </a><br />
	<a href="<%=request.getContextPath() %>/ajax/resBody.json"> JSON ���� </a><br />
	<a href="<%=request.getContextPath() %>/ajax/resVOBody.json"> JSON VO ���� </a><br />
	<a href="<%=request.getContextPath() %>/ajax/resStringListBody.json"> JSON List(���ڿ�) ���� </a><br />
	<a href="<%=request.getContextPath() %>/ajax/resVOListBody.json"> JSON List(VO) ���� </a><br />
	<a href="<%=request.getContextPath() %>/file/uploadForm.do"> ���� ���ε� </a><br />
</body>
</html>
