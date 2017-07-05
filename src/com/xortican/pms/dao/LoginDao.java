package com.xortican.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xortican.pms.DBConnection.DBConnection;
import com.xortican.pms.model.EmpFinModel;
import com.xortican.pms.model.PaySlipModel;

public class LoginDao {

	public static boolean loginValidate(String email,String password,HttpServletRequest request){
		 boolean status = false;
		 HttpSession session = request.getSession();
		try {
			Connection con = DBConnection.getConnection();
			System.out.println("Connection Established");
			//String sql = "Select * from EmployeeDetails where email=? and pwd=?";
			
			int EmpId=0;
			String name,dept,desg,doj,dow,saccno,pfaccno,urole,mobile,uemail,dob,add1,add2,city,state,country;
			String basicpay,da,ma,hra,ca,insurance,pf;
			
			PreparedStatement preparedStatement = con.prepareStatement("select * from EmployeeDetails A inner join EmployeeFinance B on A.empcode = B.empcodefinance "
					+ "						inner join EmployeeSalary c on B.empcodefinance = C.empcodesalary where A.email=? and A.pwd=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				EmpId=resultSet.getInt("empcode");
				name=resultSet.getString("name");
				dept=resultSet.getString("department");
				desg=resultSet.getString("designation");
				doj=resultSet.getString("doj");
				dow=resultSet.getString("nwdays");
				saccno=resultSet.getString("accno");
				pfaccno=resultSet.getString("pfaccno");
				urole=resultSet.getString("utype");
				mobile=resultSet.getString("mobile");
				dob=resultSet.getString("dob");
				uemail=resultSet.getString("email");
				add1=resultSet.getString("add1");
				add2=resultSet.getString("add2");
				city=resultSet.getString("city");
				state=resultSet.getString("state");
				country=resultSet.getString("country");
				basicpay=resultSet.getString("basicpay");
				da=resultSet.getString("da");
				ma=resultSet.getString("mediclaim");
				hra=resultSet.getString("hra");
				ca=resultSet.getString("ca");
				insurance=resultSet.getString("insurance");
				pf=resultSet.getString("pf");
				
				System.out.println("LEmpId ----->"+EmpId);
				System.out.println("LEmpName ----->"+name);
				
				session.setAttribute("empId",EmpId);
				session.setAttribute("name",name);
				session.setAttribute("dept",dept);
				session.setAttribute("desg",desg);
				session.setAttribute("doj",doj);
				session.setAttribute("dow",dow);
				session.setAttribute("saccno",saccno);
				session.setAttribute("pfaccno",pfaccno);
				session.setAttribute("urole",urole);
				session.setAttribute("mobile",mobile);
				session.setAttribute("dob",dob);
				session.setAttribute("uemail",uemail);
				session.setAttribute("add1",add1);
				session.setAttribute("add2",add2);
				session.setAttribute("city",city);
				session.setAttribute("state",state);
				session.setAttribute("country",country);
				session.setAttribute("basicpay",basicpay);
				session.setAttribute("da",da);
				session.setAttribute("ma",ma);
				session.setAttribute("hra",hra);
				session.setAttribute("ca",ca);
				session.setAttribute("insurance",insurance);
				session.setAttribute("pf",pf);
				
				try{
					int sTotal = Integer.parseInt(basicpay)+Integer.parseInt(da)+Integer.parseInt(ma)+Integer.parseInt(hra)+Integer.parseInt(ca);
					String total=String.valueOf(sTotal);
					session.setAttribute("total", total);
					
					int sTotal1 = Integer.parseInt(insurance)+Integer.parseInt(pf);
					String total1=String.valueOf(sTotal1);
					session.setAttribute("total1", total1);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
				status=true;
				System.out.println("Query Executed");
				System.out.println(status);
				
				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public boolean fetchDetails(HttpServletRequest request){
		boolean status = false;
		 HttpSession session = request.getSession();
		try {
			Connection con = DBConnection.getConnection();
			System.out.println("Connection Established");
			//String sql = "Select * from EmployeeDetails where email=? and pwd=?";
			
			int EmpId=0;
			String name,dept,desg,doj,dow,saccno,pfaccno,urole,mobile,uemail,dob,add1,add2,city,state,country;
			String basicpay,da,ma,hra,ca,insurance,pf;
			
			PreparedStatement preparedStatement = con.prepareStatement("select * from EmployeeDetails A inner join EmployeeFinance B on A.empcode = B.empcodefinance "
					+ "						inner join EmployeeSalary c on B.empcodefinance = C.empcodesalary");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				EmpId=resultSet.getInt("empcode");
				name=resultSet.getString("name");
				dept=resultSet.getString("department");
				desg=resultSet.getString("designation");
				doj=resultSet.getString("doj");
				dow=resultSet.getString("nwdays");
				saccno=resultSet.getString("accno");
				pfaccno=resultSet.getString("pfaccno");
				urole=resultSet.getString("utype");
				mobile=resultSet.getString("mobile");
				dob=resultSet.getString("dob");
				uemail=resultSet.getString("email");
				add1=resultSet.getString("add1");
				add2=resultSet.getString("add2");
				city=resultSet.getString("city");
				state=resultSet.getString("state");
				country=resultSet.getString("country");
				basicpay=resultSet.getString("basicpay");
				da=resultSet.getString("da");
				ma=resultSet.getString("mediclaim");
				hra=resultSet.getString("hra");
				ca=resultSet.getString("ca");
				insurance=resultSet.getString("insurance");
				pf=resultSet.getString("pf");
				
				System.out.println("LEmpId ----->"+EmpId);
				System.out.println("LEmpName ----->"+name);
				
				session.setAttribute("empId",EmpId);
				session.setAttribute("name",name);
				session.setAttribute("dept",dept);
				session.setAttribute("desg",desg);
				session.setAttribute("doj",doj);
				session.setAttribute("dow",dow);
				session.setAttribute("saccno",saccno);
				session.setAttribute("pfaccno",pfaccno);
				session.setAttribute("urole",urole);
				session.setAttribute("mobile",mobile);
				session.setAttribute("dob",dob);
				session.setAttribute("uemail",uemail);
				session.setAttribute("add1",add1);
				session.setAttribute("add2",add2);
				session.setAttribute("city",city);
				session.setAttribute("state",state);
				session.setAttribute("country",country);
				session.setAttribute("basicpay",basicpay);
				session.setAttribute("da",da);
				session.setAttribute("ma",ma);
				session.setAttribute("hra",hra);
				session.setAttribute("ca",ca);
				session.setAttribute("insurance",insurance);
				session.setAttribute("pf",pf);
				
				try{
					int sTotal = Integer.parseInt(basicpay)+Integer.parseInt(da)+Integer.parseInt(ma)+Integer.parseInt(hra)+Integer.parseInt(ca);
					String total=String.valueOf(sTotal);
					session.setAttribute("total", total);
					
					int sTotal1 = Integer.parseInt(insurance)+Integer.parseInt(pf);
					String total1=String.valueOf(sTotal1);
					session.setAttribute("total1", total1);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				
			}
				status=true;
				System.out.println("Query Executed");
				System.out.println(status);
				
				
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	

	public static boolean fetchFinTab(String empcodefinance, HttpServletRequest request) {
			 boolean status = false;
			 HttpSession session = request.getSession();
			try {
				Connection con = DBConnection.getConnection();
				System.out.println("Connection Established");
		
				//String query = "select department,designation from EmployeeFinance where empcodefinance=?";
				//System.out.println(empcodefinance.getEmpcodefinance());
				PreparedStatement preparedStatement = con.prepareStatement("select department,designation from EmployeeFinance where empcodefinance=?");
				preparedStatement.setString(1, empcodefinance);
				
				//System.out.println(query);
				
				ResultSet resultSet = preparedStatement.executeQuery();
				while(resultSet.next()){
					int empcodefin = resultSet.getInt(1);
					session.setAttribute("empcodefin", empcodefin);
					
					System.out.println("--->"+empcodefin);
				}
					
					
					
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			return status;
	}

}
