<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Changing Password</title>
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
       <div class="container">
        <div class="row" id="loginbody">
          <div class="col-md-9">
            <p class="bth">CHANGE YOUR PASSWORD</p>
            <hr class="style4">
            <div class="row">
              <form action="ChangePasswordController" method="post">
                <div class="form-group">
                  <div class="col-md-3">
                    <label class="labelname" for="">New Password</label>
                  </div>
                  <div class="col-md-3">
                    <input type="text" class="form-control" name="newpassword" placeholder="Enter new password" style="width:250px;">
                  </div>
                  <div class="col-md-1">
                  </div>
                </div>
              </div>
                <div class="row" id="loginid">
                  <div class="col-md-3">
                    <label class="labelname" for="">Confirm Password</label>
                  </div>
                  <div class="col-md-3">
                    <input type="password" class="form-control" name="confirmpassword" placeholder="Enter confirm Password" style="width:250px;">
                  </div>
                  <div class="col-md-1">
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-3">
                  </div>
                  <div class="col-md-3" id="btn">
                    <input type="submit" id="lbtn" name="" value="Submit">
                    <input type="reset"  id="rbtn" name="" value="Reset">
                  </div>
                  <div class="col-md-1">
                  </div>
                </div>
              </form>
             </div>
              <div class="col-md-3">
                <p class="bth">ADVERTISEMENT</p>
                <hr class="style4">
                <div class="row">
                  <div class="col-md-3">
                  	<img src="images/ads1.jpg" alt="Ad1" style="width:250px; height:200px;">
                  </div>
                </div>
            </div>
          </div>
        </div>
        <div class="container">
          <div class="row" id="loginfooterid">
            <div class="col-md-12">
              <p class="pull-right">@ Payrol Management System</p>
            </div>
          </div>
        </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>