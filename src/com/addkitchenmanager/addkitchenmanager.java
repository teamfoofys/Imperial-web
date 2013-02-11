package com.addkitchenmanager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imperial.db.Dbconnection;

/**
 * Servlet implementation class addkitchenmanager
 */
public class addkitchenmanager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addkitchenmanager() {
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
		
		String var1=request.getParameter("km_id");
		String var2=request.getParameter("km_name");
		String var3=request.getParameter("km_pwd");
		String var4=request.getParameter("km_addr");
		String var5=request.getParameter("km_email");
		int var6=Integer.parseInt(request.getParameter("km_contact"));
		PrintWriter out=response.getWriter();
		
		Connection con=null;
		Statement st=null;
	    try
        {
	    	
        	con=Dbconnection.DbConn();
        	st=con.createStatement();
        	st.executeUpdate("insert into kitchen_manager(km_id,km_name,km_pwd,km_address,km_email,km_contact) values('"+var1+"','"+var2+"','"+var3+"','"+var4+"','"+var5+"',"+var6+")");
        	out.println("success");
        }
        catch(Exception e)
        {
        	out.println("failure");
            e.printStackTrace();
        }
		
	}
		
		
		
	}


