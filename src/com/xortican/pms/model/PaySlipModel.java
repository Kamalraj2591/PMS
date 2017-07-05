package com.xortican.pms.model;

public class PaySlipModel {
	
	int empcode;
	String name,department, designation,doj;
	int dow,salaryaccno,pfaccno,basicpay,da,ma,hra,ca,insurance,pf;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getDow() {
		return dow;
	}
	public void setDow(int dow) {
		this.dow = dow;
	}
	public int getSalaryaccno() {
		return salaryaccno;
	}
	public void setSalaryaccno(int salaryaccno) {
		this.salaryaccno = salaryaccno;
	}
	public int getPfaccno() {
		return pfaccno;
	}
	public void setPfaccno(int pfaccno) {
		this.pfaccno = pfaccno;
	}
	public int getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getCa() {
		return ca;
	}
	public void setCa(int ca) {
		this.ca = ca;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return "payslipmodel [empcode=" + empcode + ", name=" + name + ", department=" + department + ", designation="
				+ designation + ", doj=" + doj + ", dow=" + dow + ", salaryaccno=" + salaryaccno + ", pfaccno="
				+ pfaccno + ", basicpay=" + basicpay + ", da=" + da + ", ma=" + ma + ", hra=" + hra + ", ca=" + ca
				+ ", insurance=" + insurance + ", pf=" + pf + "]";
	}
}
