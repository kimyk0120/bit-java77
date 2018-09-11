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

<script>
	$(function() {
		$(document.commentForm).on("submit", function() {
			var no = this.no.value;
			var writer = this.comment_writer;
			var content = this.content;
			
			$.ajax({
				url : "${pageContext.request.contextPath}/board/commentRegist.json",
				method : "POST",
				data : {
					no : no,
					writer : writer.value,
					content : content.value
				},
				dataType : "json"
			}).done(function(data) {
				$("#commentList").prepend(
					"<div data-idx='"+data.cno+"'>"
					+"<input type='text' value='"+data.writer+"' readonly/>"
					+" : "
					+"<input type='text' value='"+data.content+"'  readonly/> "
					+"<input type='button' value='delete' class='commentDelBtn'/> "
					+"<input type='button' value='update' class='commentUpdateBtn'/>"
					+"</div>");
				
				writer.value="";
				content.value="";				
			});
			
			return false;
		}); 
		
		$("#commentList").on("click", ">div>.commentDelBtn", function() {
			var box = $(this).parent()[0];
			var cno = $(box).attr("data-idx");
			
			$.ajax({
				url : "${pageContext.request.contextPath}/board/commentDelete.json",
				method : "GET",
				data : {
					cno : cno
				},
			}).done(function() {
					$(box).remove();
			});
		});
		
		$("#commentList").on("click", ">div>.commentUpdateBtn", function() {
			var box = $(this).parent()[0];
			var cno = $(box).attr("data-idx");
			var oriWriter = $(box).children("input[type=text]")[0];
			var oriContent = $(box).children("input[type=text]")[1];
			$(box).children().prop("disabled", true);
			var updateBox = $("<div></div>");
			$("<input type='hidden' value='"+cno+"'/>").appendTo(updateBox);
			$("<input type='text' value='"+oriContent.value+"'/>").appendTo(updateBox);
			$("<input type='button' value='수정' class='updateComplte'/>").appendTo(updateBox);
			$("<input type='button' value='취소' class='updateCancle'/>").appendTo(updateBox);
			$(box).append(updateBox);
		});
		
		$("#commentList").on("click", ">div>div>.updateComplte", function() {
			var box = $(this).parent()[0];
			var cno = $(box).parent().attr("data-idx");
			var chContent = $(box).children("input[type=text]")[0];
			
			console.dir(box);
			$.ajax({
				url : "${pageContext.request.contextPath}/board/commentUpdate.json",
				method : "POST",
				data : {
					cno : cno,
					content : chContent.value
				}
			}).done(function() {
				$(box).parent().children("input[type=text]")[1].value=chContent.value;
				$(box).parent().children().prop("disabled", false);
				$(box).remove();
			});
		});
		
		$("#commentList").on("click", ">div>div>.updateCancle", function() {
			var box = $(this).parent();
			box.parent().children().prop("disabled", false);
			box.remove();
		});
	});
	
	var downPage = function() {
		return false;
	};
</script>

</head>
<body>
	<script>
		if("${msg}") {
			alert("${msg}");
		}
	</script>
	<div class="wrap">
		번호:<c:out value="${board.no }"/> <br/>
		제목:<c:out value="${board.title }"/> <br/>
		작성자:<c:out value="${board.writer }"/> <br/>
		내용:<c:out value="${board.content }"/><br/>
		<c:choose>
			<c:when test="${not empty fileList }">
				<c:forEach var="file" items="${fileList }">
					<img src="${pageContext.request.contextPath }/upload/${file.filePath}/${file.realFileName}" width="150px" height="150px"/><br/>
					<c:out value="${file.oriFileName }"/>(<c:out value="${file.fileSize}"/>)
					<a href="${pageContext.request.contextPath}/down.do?path=${file.filePath}&rName=${file.realFileName}&oName=${file.oriFileName}"
						onclick="downPage();">다운로드</a>
					<br/>
				</c:forEach>
			</c:when>
			<c:otherwise>
				파일 없음
			</c:otherwise>
		</c:choose>
		<input type="button" value="삭제" onclick="document.location.href='delete.do?no=${board.no}'"/>
		<input type="button" value="수정" onclick="document.location.href='update.do?no=${board.no}'"/>
		<input type="button" value="리스트" onclick="document.location.href='${pageContext.request.contextPath}/board/list.do'"/>
		<hr/>
		<form name="commentForm">
			<input type="hidden" value="${board.no }" name="no" />
			<input type="text" value="" name="comment_writer" placeholder="닉네임"/>
			<input type="text" value=""	name="content" placeholder="댓글 내용" />
			<input type="submit" value="댓글등록" />	
		</form>
		<div id="commentList">
			<c:choose>
				<c:when test="${not empty commentList }">
					<c:forEach var="comment" items="${commentList }">
						<div data-idx="${comment.cno }">
							<input type="text" value="${comment.writer }" readonly/>
							:
							<input type="text" value="${comment.content }" readonly/>
							<input type="button" value="delete" class="commentDelBtn"/>
							<input type="button" value="update" class="commentUpdateBtn"/>
						</div>
					</c:forEach>
				</c:when>
				<c:otherwise>
					등록된 댓글이 없습니다.
				</c:otherwise>
			</c:choose>
		</div>
		
		<c:choose>
			<c:when test="${not empty before}">
				<a href="detail.do?no=${before.no }"><c:out value="${before.title }"/></a>
			</c:when>
			<c:otherwise>
				이전글이 없습니다.
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test="${not empty next }">
				<a href="detail.do?no=${next.no }"><c:out value="${next.title }"/></a>
			</c:when>
			<c:otherwise>
				다음글이 없습니다.
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>