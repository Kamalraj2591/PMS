package com.xortican.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xortican.pms.dao.*;
import com.xortican.pms.model.*;
import com.xortican.pms.DBConnection.*;

/**
 * Servlet implementation class EmpFinController
 */
@WebServlet("/EmpFinController")
public class EmpFinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpFinController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String empcodefinance=request.getParameter("empcode");
		String deptartment=request.getParameter("dept");
		String desgination=request.getParameter("desg");
		String doj=request.getParameter("dateofjoining");
		String pfaccno=request.getParameter("PFAccono");
		String accno=request.getParameter("Accno");
		String insurance=request.getParameter("insur");
		
		
		EmpRegModel empRegModel = new EmpRegModel();
		
		EmpFinModel empFinModel=new EmpFinModel();
		empFinModel.setEmpcodefinance(empRegModel.getEmpcode());
		empFinModel.setDeptartment(deptartment);
		empFinModel.setDesgination(desgination);
		empFinModel.setDoj(doj);
		empFinModel.setPfacco(pfaccno);
		empFinModel.setAccno(accno);
		empFinModel.setInsurance(insurance);
		
		
		int status = EmpFinDao.save(empFinModel,request);
		
		if(status>0)
			{
			//out.println("<p>Record saved successfully! </p>");
			//request.getRequestDispatcher("EmpFinace.jsp").include(request, response);
			response.sendRedirect("EmpFinance.jsp");
			}
		else
		{
			out.println("Sorry! Unable to save record");
		}
		
		LoginDao loginDao = new LoginDao();
		loginDao.fetchDetails(request);
		
		out.close();
		}

	}

