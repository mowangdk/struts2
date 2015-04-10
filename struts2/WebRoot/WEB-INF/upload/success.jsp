<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
		<table>
		<c:forEach items="${filelist}" var="file" >
			<tr>
				<td><!-- 上传成功文件名 -->${file.filename }</td>
				
				<td><!-- 下载文件名作为连接参数的filename值，用OGNL表达式进行表达  --><a href="<c:url value='truedownload.action?name=${file.filename}&type=${file.filetype }' />" >下载</a></td>
			</tr>
		</c:forEach>
		</table>
  </body>
</html>
