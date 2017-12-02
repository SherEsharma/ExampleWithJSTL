
    <%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
</head>
<body>
<p><br><br>
<!-- <center><b>Enter Data Type Format (Only rtf,html or pdf)</b><br> -->
<a href="selectAnimalServlet">Click here to show record</a>
<!-- 
<form action="../helloServletPDF" method="GET" name="upform">
<input type="text" name="Text1" ><br>
<input type="submit" name="Submit" value="Submit" >
</form>
</center> -->


   
     <c:set var="currentDate" value="2017-10-24 03:22:16" />

  <%
    String resp = null; 
    resp = (String)pageContext.getAttribute("currentDate");   //No exception.
    System.out.println(resp);
    
    pageContext.setAttribute("Date", resp);
  %>
   <p>Current date after parsing: <c:out value="${Date}" /></p>
     <fmt:parseDate value="${currentDate}" var="parsedCurrentDate" pattern="yyyy-MM-dd HH:mm:ss" />
     
<%-- 	<fmt:parseDate value="${parsedCurrentDate}" var="parsedCurrentDate1" pattern="dd-MMM-yyyy" />
 --%>
<%-- <%	String date1=new SimpleDateFormat("dd-MMM-yyyy").format(date);
System.out.println(date1);
String time1=new SimpleDateFormat("HH:MM a").format(date);
System.out.println(time1); %>
 --%>
     <p>Current date after parsing: <c:out value="${parsedCurrentDate}" /></p>

</body>
</html>