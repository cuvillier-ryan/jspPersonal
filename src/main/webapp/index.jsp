<%--
  Created by IntelliJ IDEA.
  User: mr.cuvillier
  Date: 9/15/20
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>

<%-- This is a page directive, that will apply to the entire page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- Let's take a look at an instance variable, and like servlet variables, this will persist between page loads. --%>
<%! int counter = 0; %>

<html>
<jsp:include page="partials%20/head.jsp">
    <jsp:param name="title" value="Burger World"/>
</jsp:include>
</head>
<body>
<div class="container">
    <h1>Welcome to Burger World!!!</h1>
    <p>Currently <%= counter %> million burgers sold</p>


    <%-- Let's take a look at some implicit objects, available to us with JSP--%>
    <p><strong>Path:</strong> <%= request.getRequestURL() %> </p>
    <p><strong>Query String:</strong> <%=request.getQueryString()%></p>
    <p><strong>"burgers" parameter:</strong><%=request.getParameter("burgers")%></p>
    <p><strong>User-Agent header:</strong> <%= request.getHeader("user-agent")%> </p>
<%--    <p><strong>IP address:</strong> <%= request.getRemoteAddr()%> </p>--%>

</div>


<%--Now let's run some arbitrary Java code, to increment the counter by 1 every time we reload this page.--%>
<% counter += 1; %>
<jsp:include page="partials%20/scripts.jsp"/>
</body>
</html>
