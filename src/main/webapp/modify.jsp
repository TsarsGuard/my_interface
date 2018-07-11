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

	<form action="modify_interface" method="get" >
		<c:forEach items="${modify_list}" var="modify">
			<tr>
				<td><label>序号</label><input type="text" name=id value=${modify.id} readonly="true"></td><br/>
				<td><label>名称</label><input type="text" name=name value=${modify.name}></td><br/>
				<td><label>请求类型</label><input type="text" name=requestMethod value=${modify.requestMethod}></td><br/>
				<td><label>请求参数</label><input type="text" name=requestParameters value=${modify.requestParameters}></td><br/>
				<td><label>响应参数</label><input type="text" name=responseParameter value=${modify.responseParameter}></td><br/>
				<td><label>分类</label><input type="text" name=classification value=${modify.classification}></td><br/>
			</tr>
		</c:forEach>
		<input type="submit" value="保存">
	</form>
	
	
</body>
</html>