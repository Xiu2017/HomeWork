<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>学生列表</h2>
	<s:if test="#parameters.res[0]==1">
		<p style="color:green">删除成功</p>
	</s:if>
	<s:elseif test="#parameters.res[0]==-1">
		<p style="color:red">删除失败</p>
	</s:elseif>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>班级</td>
			<td>操作</td>
		</tr>
		<s:iterator var="obj" value="#request.stuList" status="ids">
			<tr>
				<td>${ids.count }</td>
				<td>${obj[0].sname }</td>
				<td>${obj[1]==null?"未分配":obj[1].cname }</td>
				<td>
					<a href="${pageContext.request.contextPath }/stuAction_selStuById?stu.sno=${obj[0].sno }">修改</a>
					<a href="${pageContext.request.contextPath }/stuAction_delStu?stu.sno=${obj[0].sno }">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">返回首页</a>
</body>
</html>