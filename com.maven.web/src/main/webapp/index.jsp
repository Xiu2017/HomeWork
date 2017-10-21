<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>功能列表</h2>
	<hr />
	<h3>班级</h3>
	<a href="${pageContext.request.contextPath }/pages/addCls.jsp">添加班级</a>
	<a href="${pageContext.request.contextPath }/clsAction_selCls">查看班级</a>
	<hr />
	<h3>学生</h3>
	<a href="${pageContext.request.contextPath }/pages/addStu.jsp">添加学生</a>
	<a href="${pageContext.request.contextPath }/stuAction_selStu">查看学生</a>
</body>
</html>