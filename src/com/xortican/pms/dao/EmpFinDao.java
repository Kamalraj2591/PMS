package com.xortican.pms.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.xortican.pms.DBConnection.DBConnection;
import com.xortican.pms.model.EmpFinModel;

import jdk.nashorn.internal.ir.RuntimeNode.Request;


public class EmpFinDao {
	public static int save(EmpFinModel empFinModel,HttpServletRequest request)
	{
		int status = 0;
//		HttpSession session = new HttpSession();
		try
		{
			String query="update EmployeeFinance set department='"+empFinModel.getDeptartment()+"', designation='"+empFinModel.getDesgination()+"', doj='"+empFinModel.getDoj()+"', pfaccno='"+empFinModel.getPfacco()+"' , accno='"+empFinModel.getAccno()+"', insurance='"+empFinModel.getInsurance()+"' where empcodefinance='"+Integer.parseInt(request.getParameter("empcode"))+"'";
			System.out.println(query);
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			System.out.println(Integer.parseInt(request.getParameter("empcode")));
			status = ps.executeUpdate();
			System.out.println(status);
			con.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}

