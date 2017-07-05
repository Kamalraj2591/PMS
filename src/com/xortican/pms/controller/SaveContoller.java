package com.xortican.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xortican.pms.dao.*;
import com.xortican.pms.model.*;
import com.xortican.pms.DBConnection.*;
@WebServlet("/SaveController")

public class SaveContoller extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String empcode = request.getParameter("empcode");
String name = request.getParameter("name");
String utype = request.getParameter("usertype");
String uname = request.getParameter("username");
String pwd = request.getParameter("password");
String cpwd = request.getParameter("confirmpassword");
String mobile = request.getParameter("mobile");
String email = request.getParameter("email");
String dob = request.getParameter("dateofbirth");
String add1 = request.getParameter("addressline1");
String add2 = request.getParameter("addressline2");
String city = request.getParameter("city");
String state = request.getParameter("state");
String country = request.getParameter("country");
System.out.println(uname);

EmpRegModel empRegModel = new EmpRegModel();
empRegModel.setEmpcode(empcode);
empRegModel.setName(name);
empRegModel.setUtype(utype);
empRegModel.setUname(uname);
empRegModel.setPwd(pwd);
empRegModel.setCpwd(cpwd);
empRegModel.setMobile(mobile);
empRegModel.setEmail(email);
empRegModel.setDob(dob);
empRegModel.setAdd1(add1);
empRegModel.setAdd2(add2);
empRegModel.setCity(city);
empRegModel.setState(state);
empRegModel.setCountry(country);


int status = EmpDao.save(empRegModel,request);
if(status>0)
	{
	out.println("<p>Record saved successfully! </p>");
	response.sendRedirect("login.jsp");
	}
else
{
	out.println("Sorry! Unable to save record");
	response.sendRedirect("EmpRegsForm.jsp");
}


 EmpDao.insertFin(empRegModel);
 EmpDao.insertSal(empRegModel);

out.close();
}
}