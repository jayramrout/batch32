<%
    String operation = (String)request.getAttribute("Operation");
    Integer result = (Integer) request.getAttribute("Result");
%>

<html>
<body>
<h1>Operation was <%=operation%></h1>
<p>Final Result is <%=result%></p>
<button name="click" value="Click Me"/>
</body>
</html>