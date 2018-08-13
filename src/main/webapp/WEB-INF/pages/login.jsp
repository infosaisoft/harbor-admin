<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <meta http-equiv="Content-Security-Policy" content="default-src 'unsafe-inline' 'unsafe-eval' *">
        <meta name="format-detection" content="telephone=no">
        <meta name="msapplication-tap-highlight" content="no">
        <meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width">
		
        <title>Harbor Admin</title>
		
		<!-- css -->
		<link rel="stylesheet" href="<c:url value="/assets/plugins/bootstrap/css/bootstrap.min.css"/>">
		<link rel="stylesheet" href="<c:url value="/assets/plugins/font-awesome/css/font-awesome.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/assets/css/style.css"/>">
		
		<!-- jQuery-->
		<script src="<c:url value="/assets/js/jquery-3.2.1.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/assets/plugins/bootstrap/js/popper.min.js"/>" type="text/javascript"></script> 
		<script src="<c:url value="/assets/plugins/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>	
    </head>
	
    <body id="id_body">

    <div class="container-fluid">
        <div class="login_box">
            <span class="login_head">Login</span>
            <form id="login_form" method="post" >
			<div id="successMessage"></div>
            <div class="row">
                <div class="col-12">
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon"><i class="fa fa-user"></i></div>
                            <input type="text" name="email" class="form-control" id="email" placeholder="Email">
                        </div>				
						<span id="err_email" class="validation_msg">Please Enter Email</span>	
						<span id="err_email_valid" class="validation_msg">Please Enter Valid Email</span>						
                    </div>
                </div>
                <div class="col-12">
                    <div class="form-group">
                        <div class="input-group">
                            <div class="input-group-addon"><i class="fa fa-lock"></i></div>
                            <input type="password" name="pass" class="form-control" id="pass" placeholder="Password">
                        </div>
						<span id="err_pass" class="validation_msg">Please Enter Password</span>
                    </div>
                </div>
                <div class="col-12">
                    <div class="form-group">
                        <button type="submit" class="btn btn-custom btn-block">Login</button>
                        <div class="text-right forgot_link"><a href="#">Forgot Password?</a></div>
                    </div>
                </div>
                
            </div>
           
        </div>
    </div>
    	
</body>

</html>

