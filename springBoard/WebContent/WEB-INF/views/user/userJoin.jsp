<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
	<script>
	$j(document).ready(function() {
		
		$j("#submit").on("click", function() {
			var $frm = $j('.boardJoin :input');
			var param = $frm.serialize();
			$j.ajax({
				url : "/board/boardJoinAction.do",
				dateType : "json",
				type : "post",
				data : param,
				success: function(data, textStatus, jqXHR)
				{
					alert("ȸ������ �Ϸ�");
					
					location.href = "/board/boardJoin.do";
				},
				error: function (jqXHR, textStatus, errorThrown)
				{
					alert("ȸ������ ����");	
				}
				
			});
		});
	});
	</script>
<body>
<form class ="boardJoin">
	<table align="center">
		<tr>
			<td><input type="hidden" name="userSeq" value="userSeq"></td>
		</tr>
		<tr>
			<td>id <input type="text" name="userId"><input type="button" value="�ߺ�üũ" /></td>
		</tr>
		<tr>
			<td>pw <input type="text" name="userPw"></td>
		</tr>
		<tr>
			<td>pwchk <input type="text"></td>
		</tr>
		<tr>
			<td>name <input type="text" name="name"></td>
		</tr>
		<tr>
			<td>�ڵ��� <input type="text" name="phone1"></td><td>��ȭ��ȣ <input type="text" name="phone2"></td><td>ȸ���ȣ <input type="text" name="phone3"></td>
		</tr>
		<tr>
			<td>�����ȣ <input type="text" name="userAddr1"></td>
		</tr>
		<tr>
			<td>�ּ� <input type="text" name="userAddr2"></td>
		</tr>
		<tr>
			<td>ȸ���ּ� <input type="text" name="userCompany"></td>
		</tr>
			<tr>
			<td>
				<input type="submit" type="button" value="ȸ������"> 
			</td>
		</tr>
	</table>
</form>
</body>
</html>