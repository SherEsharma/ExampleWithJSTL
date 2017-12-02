<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<% int candidate_id=50;

HttpSession s=request.getSession();
s.setAttribute("candidate_id",candidate_id);

%>

<a href="test.jsp">interview</a>
<input type="text" value="<%=candidate_id%>">
</body>
</html>