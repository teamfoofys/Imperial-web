<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<link rel="stylesheet" type="text/css" href="commonstyle.css">
<script  type="text/javascript" src="validate.js"></script>
<title>Login Page</title> 

</head>
<body>
<form name="actionForm" action="LoginServlet" method ="GET" onsubmit="return fnLogin()">
<img src="images/image1.jpg" alt="no image" width="300" height="300" align="left"/>

<div align="center">
<table>
<tr>
<td align="center"><h2><font color="blue">Welcome to Imperial Hotel</font><br></h2>
				   <h3><font color="blue">Shivajinagar</font></h3></td>
</tr>
</table>
</div>

<br>
<br>

<div align="right">
<table>
<tr>
<td width="15">Username:</td>
<td width="10"><input type="text" name="uname" maxlength="20" width="20"/></td>
<td width="200"><div id="error1"></div></td>
</tr>

<tr>
<td width="15">Password:</td>
<td width="10"><input type="password" name="password" maxlength="10" width="20"/></td>
<td width="200"><div id="error2"></div></td>
</tr>

<tr>
<td width="15"></td>
<td width="10"><input type="submit" value="Login" > 

<script>
function formReset()
{
document.getElementById("frm1").reset();
}
</script>



<form name="frm1">
<input type="reset" onclick="formReset()" value="Reset form">
</form>


</tr>

</table>
</div>

</form>


</body>
</html>