<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
파일 저장이 완료되었습니다.(파일 이름) : 
<%
String path = application.getRealPath("/")+"upload/";
String filename = null;

MultipartRequest multi = new MultipartRequest(request, path, 10*1024*1024, "utf-8");
filename = multi.getFilesystemName("picture");
%>
<script>
const img = opener.document.querySelector("#pic")
img.src = "<%=request.getContextPath()%>/upload/<%=filename%>"
opener.document.f.picture.value="<%=filename%>"
self.close();
</script>
</body>
</html>