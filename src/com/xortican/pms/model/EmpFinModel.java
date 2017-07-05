package com.xortican.pms.model;

public class EmpFinModel {
	
	public String empcodefinance,deptartment, desgination, doj, pfacco, accno, insurance;
	
	
	public String getEmpcodefinance() {
		return empcodefinance;
	}
	public void setEmpcodefinance(String empcodefinance) {
		this.empcodefinance = empcodefinance;
	}
	public String getDeptartment() {
		return deptartment;
	}
	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getPfacco() {
		return pfacco;
	}
	public void setPfacco(String pfacco) {
		this.pfacco = pfacco;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "EmpFinModel [empcodefinance=" + empcodefinance + ", deptartment=" + deptartment + ", desgination="
				+ desgination + ", doj=" + doj + ", pfacco=" + pfacco + ", accno=" + accno + ", insurance=" + insurance
				+ "]";
	}
	

}
