<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script>
	if ("${msg}") {
		alert("${msg}");
	}
</script>

</head>
<body>


	<form action="<%=request.getContextPath()%>/form/join.do" method="POST">
		���̵� : <input type="text" name="id" size="20" /><br /> ��ȣ : <input
			type="text" name="password" size="20" /><br /> �̸� : <input
			type="text" name="name" size="20" /><br /> <input type="submit"
			value="����" />
	</form>

</body>
</html>