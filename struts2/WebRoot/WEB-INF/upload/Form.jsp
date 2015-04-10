<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'form.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
  <form action="<c:url value='upload.action' />" method="post" enctype="multipart/form-data">
  <table>
    <tr>
    		<td>上传文件:文件1：<input type="file" name="uploadFile.uploadimage" /></td>
    	</tr>
    	<tr>
    		<td>文件2：<input type="file" name="uploadFile.uploadimage" /></td>
    	</tr>
    	<tr>
    		<td>文件3：<input type="file" name="uploadFile.uploadimage" /></td>
    	</tr>
    	<tr>
    		<td>文件4：<input type="file" name="uploadFile.uploadimage" /></td>
    	</tr>
    	<tr>
    		<td>文件5：<input type="file" name="uploadFile.uploadimage" /></td>
    	</tr>
    	<tr>
    		<td align="left"><input type="submit" value="submit"></td>
    	</tr>
    </table>
  </form>
  </body>
</html>
