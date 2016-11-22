<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
	<H2>HelloWorld: 헬로월드</H2>
	<HR>
	<%-- JSP 표혀식으로 자바의 Data 클래스를 이용한 현재 날짜 시가 출력 --%>
	현재 날짜와 시간은 : <%=new java.util.Date() %>
	</center>

</body>
</html>