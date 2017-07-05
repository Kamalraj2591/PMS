package com.xortican.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.xortican.pms.DBConnection.DBConnection;
import com.xortican.pms.model.EmpRegModel;

public class ChangePasswordDao {
	
	public static int changePassword( String pwd, String cpwd, HttpServletRequest request){
		int status = 0;
		EmpRegModel empRegModel = new EmpRegModel();
		
		try{
			
			Connection con = DBConnection.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement("update EmployeeDetails set pwd=?,cpwd=? where empcode=?");
			preparedStatement.setString(1, pwd);
			preparedStatement.setString(2, cpwd);
			preparedStatement.setString(3, empRegModel.getEmpcode());
			
			System.out.println("-<->-"+empRegModel.getEmpcode());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return status;
		
	}

}
