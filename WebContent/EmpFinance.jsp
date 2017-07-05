<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="form/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
  <style>
.form-horizontal {
     padding-top: 50px;
     
}
</style>
</head>
<body style="background-color:#00008B;">
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
          <div class="col-md-9" style="color:#1D3C6B;">EMPLOYEE FINANCE RECORD
          <div style="height:0;width:800px;border:0;border-bottom:3px;border-style: solid;border-color: #A9A9A9"></div>
          <form class="form-horizontal" action="EmpFinController" method="post">
             <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> Employee Code </label>
              <div class="col-md-10">
                <input type="text" name="empcode" value="<%= session.getAttribute("empId") %>" readonly="true">
                 </div>
             </div>
              <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> Department </label>
              <div class="col-md-10">
                <select class="form-control" name="dept">
                  <option value="select">--SELECT--</option>
                  <option value="HR Department">HR Department</option>
                  <option value="IT Department">IT Department</option>
                  <option value="Administration Department">Administration Department</option>
                  
                </select>
              </div>
             </div>
              <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> Designation </label>
              <div class="col-md-10">
                <select class="form-control" name="desg">
                  <option value="select">--SELECT--</option>
                  <option value="Manager">Manager</option>
                  <option value="Developer">Developer</option>
                  <option value="Tester">Tester</option>
                  <option value="Admin">Admin</option>
                </select>
              </div>
             </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Date of Joining </label>
              <div class="col-md-10">
                <input type="date" name="dateofjoining" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> PF Account No </label>
              <div class="col-md-10">
                <input type="text" name="PFAccono" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Account No </label>
              <div class="col-md-10">
                <input type="text" name="Accno" />
              </div>
            </div>
            <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Insurance Per Month </label>
              <div class="col-md-10">
                <input type="text" name="insur" />
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