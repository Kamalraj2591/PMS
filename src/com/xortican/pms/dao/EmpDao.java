package com.xortican.pms.dao;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

import com.xortican.pms.DBConnection.DBConnection;
import com.xortican.pms.model.*;


public class EmpDao {
	
	
	public static int save(EmpRegModel empRegModel,HttpServletRequest request)
	{
		int status = 0;
		try
		{
			//Connection con = DBConnection.getConnection();
			//PreparedStatement ps = con.prepareStatement("insert into registration(name, usertype, username, password, confirmpassword, mobile, email, dateofbirth, addressline1, addressline2, city, state, country) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		Connection con=DBConnection.getConnection();
		PreparedStatement preparedStatement = con.prepareStatement("insert into EmployeeDetails(empcode,name,utype,uname,pwd,cpwd,mobile,email,dob,add1,add2,city,state,country) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	    preparedStatement.setString(1, empRegModel.getEmpcode());
		preparedStatement.setString(2, empRegModel.getName());
		preparedStatement.setString(3, empRegModel.getUtype());
		preparedStatement.setString(4, empRegModel.getUname());
		preparedStatement.setString(5, empRegModel.getPwd());
		preparedStatement.setString(6, empRegModel.getCpwd());
		preparedStatement.setString(7, empRegModel.getMobile());
		preparedStatement.setString(8, empRegModel.getEmail());
		preparedStatement.setString(9, empRegModel.getDob());
		preparedStatement.setString(10, empRegModel.getAdd1());
		preparedStatement.setString(11, empRegModel.getAdd2());
		preparedStatement.setString(12, empRegModel.getCity());
		preparedStatement.setString(13, empRegModel.getState());
		preparedStatement.setString(14, empRegModel.getCountry());
		
		status = preparedStatement.executeUpdate();
		con.close();
		
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
	
	
	public static int insertFin(EmpRegModel empRegModel){
		int status1 = 0;
		Connection con;
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into EmployeeFinance(empcodefinance) select empcode from EmployeeDetails where email=?");
			ps.setString(1, empRegModel.getEmail());
			
				
			status1 = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //System.out.println("insert into EmployeeFinance(empcodefinance) select empcode from EmployeeDetails where email='"+empRegModel.getEmpcode()+"'");
		System.out.println("Emp Email "+empRegModel.getEmail());
		
		
		return status1;
		
	}
	
	public static int insertSal(EmpRegModel empRegModel){
		int status2 = 0;
		Connection con;
		try {
			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into EmployeeSalary(empcodesalary) select empcode from EmployeeDetails where email=?");
			ps.setString(1, empRegModel.getEmail());
			
				
			status2 = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("insert into EmployeeFinance(empcodefinance) select empcode from EmployeeDetails where email='"+empRegModel.getEmpcode()+"'");
		System.out.println("Empcode "+empRegModel.getEmail());
		
		
		return status2;
		
	}
	
}