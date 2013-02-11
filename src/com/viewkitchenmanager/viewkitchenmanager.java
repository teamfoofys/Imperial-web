package com.viewkitchenmanager;

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
 * Servlet implementation class viewkitchenmanager
 */
public class viewkitchenmanager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewkitchenmanager() {
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
        	ResultSet result=st.executeQuery("select * from kitchen_manager");
             while(result.next()==true)
             {
            	 pw.println("kitchen manager details");
            	 String var1=result.getString(1);
            	 String var2=result.getString(2);
            	 String var3=result.getString(3);
            	 String var4=result.getString(4);
            	 pw.println("kitchen manager ID");
            	 pw.println(var1);
            	 pw.println("kitchen manager name");
               	 pw.println(var2);
               	 pw.println("kitchen manager password");
            	 pw.println(var3);
            	 pw.println("kitchen manager address");
            	 pw.println(var4);
             }}
             catch(Exception e)
             {
             	pw.println("failure");
                 e.printStackTrace();
             }
     		
     	}

		
		
		
	}


