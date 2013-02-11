package com.viewfeedback;

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
 * Servlet implementation class viewfeedback
 */
public class viewfeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewfeedback() {
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
        	ResultSet result=st.executeQuery("select * from feedback_details");
             while(result.next()==true)
             {
            	 pw.println("feed back details:");
            	 String var1=result.getString(1);
            	 String var2=result.getString(2);
            	 String var3=result.getString(3);
                 pw.println("date of feedback");
            	 pw.println(var1);
            	 pw.println("feedback from customer");
               	 pw.println(var2);
               	pw.println("rating from customer");
              	 pw.println(var3);
               	 
             }}
             catch(Exception e)
             {
             	pw.println("failure");
                 e.printStackTrace();
             }
     		
     	}
		
		
	}


