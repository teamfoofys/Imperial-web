<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>  
<%@ page import="java.lang.String"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="commonstyle.css">
<title>Login Success</title>
</head>
<body>
<%
  String userID = request.getParameter("uname");
%>

<!-- <img src="/logo.jpg" alt="no image"  align="justify width="300" height="130" >-->
<body background="C:\Users\Arun\Desktop\images1\imperial.png">

<marquee behavior="slide" direction="left"><h3><font color="white">Welcome, Login Successful
</h3></marquee></font>


<br><br><br><br>

 
<div align="center">

<FORM action="Employee.jsp">
<INPUT type=submit   button style="width: 120px; height: 40px;" value="Employee List"><a href="Employee.jsp" ></a>
</FORM>

<FORM action="Menu.jsp"><INPUT type=submit button style="width: 120px; height: 40px;" value="Menu Modification"><a
href="Menu.jsp" ></a>
</FORM>

<FORM action="Kitchen.jsp"><INPUT type=submit button style="width: 120px; height: 40px;" value="Kitchen"><a
href="Kitchen.jsp" ></a>
</FORM>

<FORM action="sales.jsp"><INPUT type=submit button style="width: 120px; height: 40px;" style="height:35px" value="Report"><a
href="Kitchen.jsp" ></a>
</FORM>

<FORM action="feedback.jsp"><INPUT type=submit button style="width: 120px; height: 40px;" style="height:35px" value="Feedback"><a
href="Kitchen.jsp" ></a>
</FORM></div>


<br><br><br>

 <div align="right">
<FORM action="LoginPage.jsp"><INPUT type=submit  button style="width: 100px; height: 30px;"  value="Logout" ><a
href="LoginPage.jsp" ></a>
<% 
if(request.getParameter("logout")!=null) 
{ 
response.setHeader("Cache-Control","no-cache"); 
response.setHeader("Pragma","no-cache"); 
response.setDateHeader ("Expires", 0); 
session.setAttribute("userid",null); 
} 
%> 
</div>



</body>
</html>