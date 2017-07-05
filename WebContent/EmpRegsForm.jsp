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
          <a id="link" href="home.jsp">Home</a>
          <a id="link" href="about.jsp">About Us</a>
          <a id="link" href="login.jsp">Login</a>
          <a id="link" href="contactus.jsp">Contact Us</a>
      </div>
      </div>
         <div class="panel-body" style="font-size:18px; color:blue;">
          <div class="col-md-9" style="color:#1D3C6B;">USER REGISTRATION FORM
          <div style="height:0;width:800px;border:0;border-bottom:3px;border-style: solid;border-color: #A9A9A9"></div>
          <form class="form-horizontal" action="SaveController" method="post">
          <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Employee Code </label>
              <div class="col-md-10">
                <input type="text" name="empcode" />
              </div>
            </div>
            <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Name </label>
              <div class="col-md-10">
                <input type="text" name="name" />
              </div>
            </div>
             <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> User Type </label>
              <div class="col-md-10">
                <select class="form-control" name="usertype">
                  <option >Employee</option>
                </select>
              </div>
             </div>
            <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Username </label>
              <div class="col-md-10">
                <input type="text" name="username" />
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> Password </label>
              <div class="col-md-10">
                <input type="password" name="password" />
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;"> Confirm Password </label>
              <div class="col-md-10">
                <input type="password" name="confirmpassword" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Mobile </label>
              <div class="col-md-10">
                <input type="number" name="mobile" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Email </label>
              <div class="col-md-10">
                <input type="email" name="email" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Date of Birth </label>
              <div class="col-md-10">
                <input type="date" name="dateofbirth" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Address Line1 </label>
              <div class="col-md-10">
                <input type="text" name="addressline1" />
              </div>
            </div>
             <div class=form-group>
            <label class="control-label col-md-2" style="color:black;"> Address Line2 </label>
              <div class="col-md-10">
                <input type="text" name="addressline2" />
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2" style="color:black;" > City </label>
              <div class="col-md-10">
                 <select class="form-control" name="city">
                 <option value="select">--SELECT--</option>
                  <option value="coimbatore">Coimbatore</option>
                  <option value="chennai">Chennai</option>
                  <option value="erode">Erode</option>
                  <option value="madurai">Madurai</option>
                  </select>
              </div>
            </div>
            <div class=form-group>
              <label class="control-label col-md-2"  style="color:black;"> State </label>
              <div class="col-md-10">
                <select class="form-control" name="state">
                  <option value="select">--SELECT--</option>
                  <option value="Tamilnadu">Tamilnadu</option>
                  <option value="Andhrapradhesh">Andhrapradhesh</option>
                  <option value="Karnataka">Karnataka</option>
                  <option value="Kerala">Kerala</option>
                  </select>
              </div>
             </div>
             <div class=form-group>
              <label class="control-label col-md-2" style="color:black;">Country </label>
              <div class="col-md-10">
                <select class="form-control" name="country">
                  <option value="select">--SELECT--</option>
                  <option value="India">India</option>
                  <option value="USA">USA</option>
                  <option value="Australia">Australia</option>
                  <option value="China">China</option>
                  </select>
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