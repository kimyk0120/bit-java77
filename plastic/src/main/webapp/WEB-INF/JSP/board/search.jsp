<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>plastic</title>

<link href="${pageContext.request.contextPath }/css/global.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/js/jquery-1.11.2.js"></script>

<style>
	.wrap > table {
		margin : 15px auto;
		width : 80%;
		border-collapse : collapse;
		border : 1px solid #aaa;
	}
</style>

<script>

	$(function() {
		// document readystate = "complete"
		
	});
</script>
</head>
<body>
	<script>
		if("${msg}") {
			alert("${msg}");
		}
	</script>
	<div class="wrap">
	
	<form action="search.do">
		<select name="sColumn">
			<option value="title">글제목</option>
			<option value="writer">글쓴이</option>
		</select>
		
		<input type="text" name="search" placeholder="검색어를 입력하세요" title="검색어는 필수입니다" required/>
		<input type="submit" value="검색" />
	</form>
	
	<c:choose>
		<c:when test="${not empty board }">
			<table border="1px">
				<colgroup>
					<col style="width:5%;">
					<col style="width:50%;">
					<col style="width:20%;">
					<col style="width:15%;">
				</colgroup>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
				</tr>
				<c:forEach var="vo" items="${board}">
				<tr align="center">
					<td><c:out value="${vo.no }"/></td>
					<td>
						<a href="detail.do?no=${vo.no}">
						<c:out value="${vo.title }"/>
						[<c:out value="${vo.commentCnt }"/>]
						</a>
					</td>
					<td><c:out value="${vo.writer }"/></td>
					<td>
						<fmt:formatDate value="${vo.regDate }" pattern="yyyy-MM-dd"/>
					</td>
				</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h1>게시글이 없습니다.</h1>
		</c:otherwise>
	</c:choose>
	<c:if test="${(currPage-1)!=0 }">
		<a href="search.do?page=1&search=${param.search }&sColumn=${param.sColumn}">&lt;&lt;</a>
	</c:if>
	<c:if test="${(currPage-1)!=0 }">
		<a href="search.do?page=${currStartPage-1 }&search=${param.search }&sColumn=${param.sColumn}">&lt;</a>
	</c:if>
	<c:forEach var="i" begin="${currStartPage }" end="${currLastPage}" >
		<c:choose>
			<c:when test="${i eq currPage }">
				<b>[${i }]</b>
			</c:when>
			<c:otherwise>
				<a href="search.do?page=${i }&search=${param.search }&sColumn=${param.sColumn}">${i }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:if test="${currLastPage<lastPage }">
		<a href="search.do?page=${currLastPage+1 }&search=${param.search }&sColumn=${param.sColumn}">&gt;</a>
	</c:if>
	<c:if test="${currLastPage<lastPage }">
		<a href="search.do?page=${lastPage }&search=${param.search }&sColumn=${param.sColumn}">&gt;&gt;</a>
	</c:if>
	<hr/>
	<input type="button" value="리스트" onclick="document.location.href='list.do'"/>
	</div>
</body>
</html>