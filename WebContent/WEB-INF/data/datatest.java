package data;
import java.sql.*;
public class datatest 
{

Connection con=null;
public Connection  getCon() throws Exception{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/rest","root","");
return con;

}
}


