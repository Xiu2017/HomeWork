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
	<h2>修改班级</h2>
	<s:if test="#parameters.res[0]==1">
		<p style="color:green">修改成功！</p>
	</s:if>
	<s:elseif test="#parameters.res[0]==-1">
		<p style="color:red">修改失败！</p>
	</s:elseif>
	<s:form action="/clsAction_updCls" method="post">
		<s:hidden name="cls.cno" />
		班级名称：<s:textfield name="cls.cname"/><br />
		<s:submit value="修改" />
	</s:form>
	<a href="${pageContext.request.contextPath }/clsAction_selCls">返回班级列表</a><br />
	<a href="${pageContext.request.contextPath }/index.jsp">返回首页</a>
</body>
</html>