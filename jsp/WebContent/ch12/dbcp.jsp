<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch12 : dpcp test</title>
</head>
<body>
<sql:query var="rs" dataSource="jdbc/mysql">
select ab_name, ab_email from addrbook
</sql:query>

	<h2>결과출력</h2>
	<HR>
	
<c:forEach var="row" items="${rs.rows}">
	이름 : ${row.ab_name}<br/>
	이메일 : ${row.ab_email}
		<HR>
</c:forEach>

</body>
</html>