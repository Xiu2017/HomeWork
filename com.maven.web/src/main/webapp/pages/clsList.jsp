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
	<h2>班级列表</h2>
	<s:if test="#parameters.res[0]==1">
		<p style="color:green">删除成功</p>
	</s:if>
	<s:elseif test="#parameters.res[0]==-1">
		<p style="color:red">删除失败</p>
	</s:elseif>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>操作</td>
		</tr>
		<s:iterator var="obj" value="#request.clsList" status="ids">
			<tr>
				<td>${ids.count }</td>
				<td>${obj.cname }</td>
				<td>
					<a href="${pageContext.request.contextPath }/clsAction_selClsById?cls.cno=${obj.cno }">修改</a>
					<a href="${pageContext.request.contextPath }/clsAction_delCls?cls.cno=${obj.cno }">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
	<a href="${pageContext.request.contextPath }/index.jsp">返回首页</a>
</body>
</html>