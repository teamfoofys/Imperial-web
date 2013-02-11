package com.view.steward;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imperial.db.Dbconnection;

/**
 * Servlet implementation class viewsteward
 */
public class viewsteward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewsteward() {
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
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
			
		Connection con=null;
		Statement st=null;
	    try
        {
	    	
        	con=Dbconnection.DbConn();
        	st=con.createStatement();
        	ResultSet result=st.executeQuery("select * from steward");
             while(result.next()==true)
             {
            	 pw.println("New steward details");
            	 String var1=result.getString(1);
            	 String var2=result.getString(2);
            	 String var3=result.getString(3);
            	 String var4=result.getString(4);
            	 pw.println("steward ID");
            	 pw.println(var1);
            	 pw.println("steward name");
               	 pw.println(var2);
               	 pw.println("steward password");
            	 pw.println(var3);
            	 pw.println("steward address");
            	 pw.println(var4);
             }}
             catch(Exception e)
             {
             	pw.println("failure");
                 e.printStackTrace();
             }
     		
     	}

     

            	 
		
		
	}


	
	
