package com.xortican.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xortican.pms.dao.LoginDao;
import com.xortican.pms.dao.SaveSalaryDao;
import com.xortican.pms.model.SalaryModel;
@WebServlet("/SalaryCalc")

public class SalaryCalc extends HttpServlet {

	public String empcode, smonth, snotes, wdays, basic, hra, mediclaim, ta, da, ca, others, pf, tax4month;
	public int id;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String empcode = request.getParameter("empcode");
		String smonth = request.getParameter("smonth");
		String wdays = request.getParameter("wdays");
		String basic = request.getParameter("basic");
		String hra = request.getParameter("hra");
		String mediclaim = request.getParameter("mediclaim");
		String ta = request.getParameter("ta");
		String da = request.getParameter("da");
		String ca = request.getParameter("ca");
		String others = request.getParameter("others");
		String pf = request.getParameter("pf");
		String tax4month = request.getParameter("tax4month");
		String snotes = request.getParameter("snotes");
		

		SalaryModel sm = new SalaryModel();
		sm.setEmpcode(empcode);
		sm.setSmonth(smonth);
		sm.setSnotes(snotes);
		sm.setWdays(wdays);
		sm.setBasic(basic);
		sm.setHra(hra);
		sm.setMediclaim(mediclaim);
		sm.setTa(ta);
		sm.setDa(da);
		sm.setCa(ca);
		sm.setOthers(others);
		sm.setPf(pf);
		sm.setTax4month(tax4month);
		
		int status = SaveSalaryDao.save(sm,request);
		if(status>0)
		{
			out.println("<p>Record saved successfully! </p>");
			request.getRequestDispatcher("addempsalary.jsp").include(request, response);
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
