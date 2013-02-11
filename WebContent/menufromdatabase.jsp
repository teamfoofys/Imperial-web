<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>display data from the table using jsp</title>
</head>
<body>
<h2>data from imperial menu</h2>
<%
try {

Connection connection = null;

Statement statement = null;
ResultSet rs = null;

Class.forName("com.mysql.jdbc.Driver").newInstance();

connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/imperial_hotel", "root", "root");

statement = connection.createStatement();

String QueryString = "SELECT * from menu";
rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getString(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
</TR>
</TABLE>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>


<font size="+3" color="red">
<%
out.println("Unable to connect to database.");
}
%>
</font>
<!-- </TABLE><TABLE>
<TR>
<TD><FORM ACTION="welcome_to_database_query.jsp" method="get" >
<button type="submit"><-- back</button></TD>
</TR>
</TABLE>
</font>-->
</body>
</html>