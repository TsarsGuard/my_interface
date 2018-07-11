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
	<form action="query" method="get">
		<label>接口名：</label> <input type="text" name="interfacename">
		<input type="submit" value="查询">
	</form>


	<form name="show" action="" method="get">
		<tr>
			<td><label>接口列表</label><br></td>
		</tr>

		<c:forEach items="${c_list}" var="can">
			<tr>
				<td>
					<input type="radio" name=interface_id value=${can.id}>${can.id}
				</td>
				<td>
					${can.name} 
					${can.requestMethod} 
					${can.requestParameters}
					${can.responseParameter} 
					${can.classification}
					</td>
				<br />
			</tr>
		</c:forEach>
		<input type="submit" value="修改" type="submit" onclick="show.action='jump';show.submit();" /> 
		<input type="submit" value="新增" type="submit" onclick="show.action='jump_add';show.submit();" />
		<input type="submit" value="删除" type="submit" onclick="show.action='del';show.submit();" />
	</form>
</body>
</html>