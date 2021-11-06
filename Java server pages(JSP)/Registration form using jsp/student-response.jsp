<html>
<head><title>Student confirmation</title></head>
<body>
The student is confirmed : 
 <%=request.getParameter("name") %>  
 <%=request.getParameter("lastname") %>  
 
 <%=request.getParameter("country") %>
 <br></br>
 Student favourite programming language is <%=request.getParameter("faouriteLanguage") %>
 <br></br>
 favourite time  <%=request.getParameter("name") %> wants --->
 <ul>
 <%
 String []langs=request.getParameterValues("time");
 for(String temp:langs)
 {
	 out.println("<li>"+temp+"</li>");
 }
 
 
 %>
 
 
</body>
</html>