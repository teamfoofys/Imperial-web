package com.imperial.steward;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.imperial.db.*;
/**
 * Servlet implementation class Addsteward
 */
public class Addsteward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addsteward() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ëntered");
		String var1=request.getParameter("ste_id");
		String var2=request.getParameter("ste_name");
		String var3=request.getParameter("ste_pwd");
		String var4=request.getParameter("ste_addr");
		String var5=request.getParameter("ste_email");
		int var6=Integer.parseInt(request.getParameter("ste_contact"));
		PrintWriter out=response.getWriter();
		Connection con=null;
		Statement st=null;
	    try
        {
	    	
        	con=Dbconnection.DbConn();
        	st=con.createStatement();
        	st.executeUpdate("insert into steward(st_id,st_name,st_pwd,st_address,st_email,st_contact) values('"+var1+"','"+var2+"','"+var3+"','"+var4+"','"+var5+"',"+var6+")");
        	out.println("success");
        }
        catch(Exception e)
        {
        	out.println("failure");
            e.printStackTrace();
        }
		
	}

}
