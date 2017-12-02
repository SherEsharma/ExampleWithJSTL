<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="mail.animalBean"
         import="mail.DAO"




   %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Animal list</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
</head>
<body>
<table class="title">
  
</table>



 <center>
<table width="100 % " id='table1'  border="1" cellspacing="2" cellpadding="2"> 
    <tr class="tab-highlighted-2"> 
        <td class="tab-highlighted-2" width="15"> 
          <div align="left">News ID</div> 
        </td> 
        <td class="tab-highlighted-2" width="20"> 
          <div align="left">News Title</div> 
        </td>
         <td class="tab-highlighted-2" width="15"> 
          <div align="left">News Decription</div> 
        </td>
        <td class="tab-highlighted-2" width="15"> 
          <div align="left">News Create_on</div> 
        </td>    
        
        <td class="tab-highlighted-2" width="15"> 
          <div align="left">Time</div> 
        </td>    
        

    </tr> 

    <c:forEach items="${beans}" var="view"> 
       <!--  <tr> --> 
      <c:set var = "string2" value = "${view.createon}" />   
  <%
    String resp = null; 
    resp = (String)pageContext.getAttribute("string2");   //No exception.
    
    Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(resp);
	String date1=new SimpleDateFormat("dd-MMM-yyyy").format(date);
	
	String time1=new SimpleDateFormat("HH:MM a").format(date);
	

    //System.out.println(resp);
    
   pageContext.setAttribute("Date", date1);
   pageContext.setAttribute("Time", time1);
  %>
       
         <c:set var = "string2" value = "${fn:substring(view.newsdecription, 0, 30)}" />
            <td>${view.newsid} </td> 
             <td>${view.newstitle}</td>
            <td>${string2}</td>
            <td>${Date}</td>
            <td>${Time}</td>
            

       </tr>  
    </c:forEach> 
</table> 

         </center>

</body></html>