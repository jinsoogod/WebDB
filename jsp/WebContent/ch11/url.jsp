<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>ch11 : url</title>
</head>
<body bgcolor="#FFFFFF">
<h3>&lt;c:url&gt;</h3>

<c:url value="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8" var="target">
	<c:param name="query">가천대학교</c:param>
</c:url>
 

<%-- 
<c:url value="choose.jsp" var="target">
	<c:param name="sel">a</c:param>
</c:url>
 --%> 
<HR>
단순 출력 : ${target} <BR>
링크 연동 : <a href="${target}">choose.jsp-a 선택</a>
</body>
</html>