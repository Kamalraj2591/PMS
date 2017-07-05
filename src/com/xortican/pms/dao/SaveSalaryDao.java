package com.xortican.pms.dao;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

import com.xortican.pms.DBConnection.DBConnection;
import com.xortican.pms.model.SalaryModel;

public class SaveSalaryDao {

	public static int save (SalaryModel sm,HttpServletRequest request)
	{
		int status = 0;
		try
		{
		String query = "update EmployeeSalary set salarymonth='"+sm.getSmonth()+"', nwdays='"+sm.getWdays()+"', basicpay='"+sm.getBasic()+"', hra='"+sm.getHra()+"', mediclaim='"+sm.getMediclaim()+"', ta='"+sm.getTa()+"',da='"+sm.getDa()+"',ca='"+sm.getCa()+"',others='"+sm.getOthers()+"',pf='"+sm.getPf()+"',taxmonth='"+sm.getTax4month()+"',snotes='"+sm.getSnotes()+"' where empcodesalary ='"+Integer.parseInt(request.getParameter("empcode"))+"'";
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement(query);
		
		System.out.println(query);
		
//		ps.setString(1, sm.getEmpcode());
//		ps.setString(2, sm.getSmonth());
//		ps.setString(3, sm.getWdays());
//		ps.setString(4, sm.getBasic());
//		ps.setString(5, sm.getHra());
//		ps.setString(6, sm.getMediclaim());
//		ps.setString(7, sm.getTa());
//		ps.setString(8, sm.getDa());
//		ps.setString(9, sm.getCa());
//		ps.setString(10, sm.getOthers());
//		ps.setString(11, sm.getPf());
//		ps.setString(12, sm.getTax4month());
//		ps.setString(13, sm.getSnotes());
		
		status = ps.executeUpdate();
		con.close();
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return status;
		
	}
	
}
