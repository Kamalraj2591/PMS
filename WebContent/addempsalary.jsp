 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Salary</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<style>
.form-horizontal {
     padding-top: 50px;
     
}
</style>
</head>
<body style="background-color:#1C74BF">
<div class="container" >
      <div class="panel panel-default" >
        <div class="panel-header">
          <div id="jumbo">
        <p id="para"><span id="head">P</span>AYROLL <span id="head">M</span>ANAGEMENT <span id="head">S</span>YSTEM</p>
      </div>
      <div class="navid">
          <a id="link" href="lhome.jsp">Home</a>
          <a id="link" href="labout.jsp">About Us</a>
          <a id="link" href="myaccount.jsp">My Account</a>
          <a id="link" href="addempsalary.jsp">Add Salary</a>
          <a id="link" href="EmpFinance.jsp">Employee Finance</a>
          <a id="link" href="payslip.jsp">Payslip</a>
          <a id="link" href="ChangePwd.jsp">Change Password</a>
          <a id="link" href="lcontactus.jsp">Contact Us</a>
          <a id="link" href="logout.jsp">Logout</a>
      </div>
      </div>
        <div class="panel-body" style="font-size:18px; color:blue;">
          <div class="col-md-9" style="color:#1D3C6B;">ADD EMPLOYEE SALARY
          <div style="height:0;width:800px;border:0;border-bottom:3px;border-style: solid;border-color: #A9A9A9"></div>
          <form class="form-horizontal" action = "SalaryCalc" method = "post">
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;">Employee Code</label>
              <div class="col-md-4">
                <input type="text" name="empcode" value="<%= session.getAttribute("empId") %>" readonly="true"/>
              </div>
             </div>
             <div class = form-group>
             <label class="control-label col-md-2" style="color:black;">Salary Month</label>
             <div class="col-md-4">
             <select class="form-control" name="smonth">
             <option value="January">January</option>
             <option value="February">February</option>
             <option value="March">March</option>
             <option value="April">April</option>
             <option value="May">May</option>
             <option value="June">June</option>
             <option value="July">July</option>
             <option value="August">August</option>
             <option value="September">September</option>
             <option value="October">October</option>
             <option value="November">November</option>
            <option value="December">December</option>
            </select>
             </div>
             </div>
            <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Number of Working Days</label>
              <div class="col-md-10">
                <input type="number" name="wdays" />
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;">Basic Pay</label>
              <div class="col-md-10">
                <input type="number" name="basic" />
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;">HRA</label>
              <div class="col-md-10">
                <input type="number" name="hra" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Mediclaim</label>
              <div class="col-md-10">
                <input type="number" name="mediclaim" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Travelling Allowance</label>
              <div class="col-md-10">
                <input type="number" name="ta" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Dearness Allowance</label>
              <div class="col-md-10">
                <input type="number" name="da" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Conveyance Allowance</label>
              <div class="col-md-10">
                <input type="number" name="ca" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Others</label>
              <div class="col-md-10">
                <input type="number" name="others" />
              </div>
            </div>
           <div class="col-md-12" style="color:#1D3C6B;">SALARY DEDUCTIONS
          <div style="height:0;width:800px;border:0;border-bottom:3px;border-style: solid;border-color: #A9A9A9"></div>
          </div>
          <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"></label>
              <div class="col-md-10">
                
              </div>
            </div>
          <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Provident Fund</label>
              <div class="col-md-10">
                <input type="number" name="pf" />
              </div>
            </div>  
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Tax for Month</label>
              <div class="col-md-10">
                <input type="number" name="tax4month" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;">Salary Notes</label>
              <div class="col-md-10">
                <textarea name="snotes" rows="8" cols="80"></textarea>
              </div>
            </div>
            <div class=form-group>
               <div class="col-md-2"></div>
                <div class="col-md-2">
                <input type="submit" name="submit" style="background-color:#1D3C6B; color:White;"/>
              </div>
              <div class="col-md-2">
                <input type="reset" name="reset" style="background-color:black; color:White;"/>
              </div>
            </div>
          </form>
          </div>
           <div class="col-md-3" style="color:#1D3C6B;">ADVERTISEMENT
           <div style="height:0;width:275px;border:0;border-bottom:3px;border-style: solid;border-color: #A9A9A9 "></div>
          <img src="images/add.jpg" alt="Mountain View" style="width:250px;height:180px; padding-top: 30px;">
          </div>
         </div>
        <div class="panel-footer"> 
        <div class=form-group>
        <div class="col-md-9"></div>
               <div class="col-md-3">@ Payroll Management System </div>
    </div>
</div>
</div>
</div>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>