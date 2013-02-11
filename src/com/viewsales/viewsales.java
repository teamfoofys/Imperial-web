package com.viewsales;

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
 * Servlet implementation class viewsales
 */
public class viewsales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewsales() {
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
        	ResultSet result=st.executeQuery("select * from sales_details");
             while(result.next()==true)
             {
            	 pw.println("sales details:");
            	 String var1=result.getString(1);
            	 String var2=result.getString(2);
                 pw.println("date of sales");
            	 pw.println(var1);
            	 pw.println("totalsales of this day");
               	 pw.println(var2);
               	 
             }}
             catch(Exception e)
             {
             	pw.println("failure");
                 e.printStackTrace();
             }
     		
     	}

     

		
		
	}


