<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
   	<form action="<c:url value='/gyq/dosubmit.action' />" method="post">  
        <s:fielderror cssStyle="color:red"></s:fielderror>  
        <table>  
            <tr>  
                <td>编号：</td>  
                <td><s:textfield name="userBean.userId"/></td>  
            </tr>  
            <tr>  
                <td>姓名：</td>  
                <td><s:textfield name="userBean.userName"></s:textfield></td>  
            </tr>  
            <tr>  
                <td>密码：</td>  
                <td><s:password name="userBean.password"></s:password></td>  
            </tr>  
            <tr>  
                <td>生日：</td>  
                <td>  
                    <s:textfield name="userBean.birthday">  
                        <s:param name="value">  
                            <s:date name="userBean.birthday" format="yyyy-MM-dd hh:MM:ss" />  
                        </s:param>  
                    </s:textfield>  
                </td>  
            </tr>  
            <tr>  
                <td>性别：</td>  
                <td><s:radio name="userBean.sex" list="#request.lstSexBean" listKey="sex" listValue="sexValue"></s:radio></td>  
            </tr>  
            <tr>  
                <td>城市：</td>  
                <td><s:select name="userBean.city" list="lstCityBean" listKey="city" listValue="cityValue" headerKey="0" headerValue="--请选择--"></s:select></td>  
            </tr>  
            <tr>  
                <td>爱好：</td>  
                <td><s:checkboxlist name="userBean.hobby" list="lstHobbyBean" listKey="hobby" listValue="hobbyValue"></s:checkboxlist></td>  
            </tr>  
            <tr>  
                <s:hidden></s:hidden>  
                <td><s:submit value="提交"/></td>  
                <td><s:reset value="重置"/></td>  
            </tr>  
        </table>  
    </form>  
  </body>
</html>
