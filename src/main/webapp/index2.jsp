<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="modify" method="get" >
		<c:forEach items="${modify_list}" var="modify">
			<tr>
				<td><input type="text" name=interface_id value=${modify.id}>${modify.id}</td>
				<td><input type="text" name=interface_name value=${modify.name}>${modify.name}</td>
				<br/>
			</tr>
		</c:forEach>
	
		<input type="submit" value="查看">
	</form>
	
	
</body>
</html>