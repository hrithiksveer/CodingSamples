<jsp:useBean id="now" class="java.util.Date"/>
<%
    String name = request.getParameter("user");
    if(name == null)
        name = "Visitor";
%>
<html>
    <head>
        <title>DemoApp</title>
    </head>
    <body>
        <h1>Welcome <%=name%></h1>
        <b>Current Time: </b>${now}
    </body>
</html>
