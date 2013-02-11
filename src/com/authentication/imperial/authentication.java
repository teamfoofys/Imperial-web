package com.authentication.imperial;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imperial.db.Dbconnection;

/**
 * Servlet implementation class authentication
 */
public class authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentication() {
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
		String var1=request.getParameter("uname");
		String var2=request.getParameter("pass");
		//response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
			
		Connection con=null;
		Statement st=null;
	    try
        {
	    	
        	con=Dbconnection.DbConn();
        	st=con.createStatement();
        	ResultSet result=st.executeQuery("select * from super_user");
             if(result.next()==true)
             {
            	 String var3=result.getString(2);
            	 String var4=result.getString(3);
            	   //String var5="LoginSuccess.jsp";          	 
            	 
        	if(var1.equals(var3) && var2.equals(var4))
        	{
        		pw.println("AUTHENTICATION SUCESSFUL ! REDIRECT TO ADMIN PAGE");
        		//response.sendRedirect("LoginSuccess.jsp");
        		//response.sendRedirect(var5);
        		//ServletContext context=getServletContext();

        		 //RequestDispatcher requestDispatcher=context.getRequestDispatcher("/LoginSuccess.jsp");
                 //requestDispatcher.forward(request, response);
                 
        	}
        	else
        	{
        		pw.println("1");
        	}
        
        }}
        catch(Exception e)
        {
        	pw.println("failure");
            e.printStackTrace();
        }
		
	}
	}


