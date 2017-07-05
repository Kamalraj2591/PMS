package com.xortican.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xortican.pms.dao.EmpDao;
import com.xortican.pms.dao.EmpFinDao;
import com.xortican.pms.dao.LoginDao;
import com.xortican.pms.model.EmpFinModel;
import com.xortican.pms.model.EmpRegModel;
import com.xortican.pms.model.PaySlipModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter printWriter = response.getWriter();
		
		String uemail = request.getParameter("email");
		String upassword = request.getParameter("password");
		LoginDao.loginValidate(uemail, upassword,request);
		
		if(LoginDao.loginValidate(uemail, upassword,request)){
			
			response.sendRedirect("welcome.jsp");
			
		}else{
			printWriter.println("Invalid username or Password");
			response.sendRedirect("login.jsp");
			
		}
		
		
		
		
	}

}
