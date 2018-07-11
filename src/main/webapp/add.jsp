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

<!-- 	<form action="add" method="get" >
			<tr>
				<td><label>序号</label><input type="text" name=interface_id ></td><br/>
				<td><label>名称</label><input type="text" name=interface_name }></td><br/>
				<td><label>请求类型</label><input type="text" name=interface_request_method }></td><br/>
				<td><label>请求参数</label><input type="text" name=interface_request_parameters }></td><br/>
				<td><label>响应参数</label><input type="text" name=interface_response_parameter }></td><br/>
				<td><label>分类</label><input type="text" name=interface_classification ></td><br/>
			</tr>
		<input type="submit" value="保存">
	</form> -->
	
		<form action="add" method="get" >
			<tr>
				<td><label>序号</label><input type="text" name=id ></td><br/>
				<td><label>名称</label><input type="text" name=name }></td><br/>
				<td><label>请求类型</label><input type="text" name=requestMethod }></td><br/>
				<td><label>请求参数</label><input type="text" name=requestParameters }></td><br/>
				<td><label>响应参数</label><input type="text" name=responseParameter }></td><br/>
				<td><label>分类</label><input type="text" name=classification ></td><br/>
			</tr>
		<input type="submit" value="保存">
	</form>
</body>
</html>