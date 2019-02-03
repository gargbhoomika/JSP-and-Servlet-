<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--

int i = Integer.parseInt(request.getParameter("Num1"));
int j = Integer.parseInt(request.getParameter("Num2"));
int k = i+j;
int l = i/j;
out.println("Output is: "+k);
out.println("DIvision is: "+l); 
   ${students}-->
   
 <!--<c:forEach items="${students}" var="s">
   ${s.name}<br/>
   </c:forEach>  -->  
   
   <c:set var="str" value="Bhoomika is a java developer"/>
   
   Length: "${fn:length(str)}"
   
   
   <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password="Bhoomi13@"/> 
   <sql:query var="rs" dataSource="${db}">Select * from testtable where age=21</sql:query>
   <c:forEach items="${rs.rows}" var="test">
   	<c:out value="${test.name}"></c:out><br>
   	<c:out value="${test.age}"></c:out><br>
   	<c:out value="${test.sex}"></c:out><br>
   </c:forEach>
</body>
</html>