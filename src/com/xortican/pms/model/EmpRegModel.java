package com.xortican.pms.model;

public class EmpRegModel {
	
	public String empcode,name, utype,uname, pwd, cpwd, mobile, email, dob, add1, add2, city, state, country,empcodesalary,empcodefinance;
	
	
	
	
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmpcodesalary() {
		return empcodesalary;
	}
	public void setEmpcodesalary(String empcodesalary) {
		this.empcodesalary = empcodesalary;
	}
	public String getEmpcodefinance() {
		return empcodefinance;
	}
	public void setEmpcodefinance(String empcodefinance) {
		this.empcodefinance = empcodefinance;
	}
	@Override
	public String toString() {
		return "EmpRegModel [empcode=" + empcode + ", name=" + name + ", utype=" + utype + ", uname=" + uname + ", pwd="
				+ pwd + ", cpwd=" + cpwd + ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + ", add1=" + add1
				+ ", add2=" + add2 + ", city=" + city + ", state=" + state + ", country=" + country + ", empcodesalary="
				+ empcodesalary + ", empcodefinance=" + empcodefinance + "]";
	}
	
		
}