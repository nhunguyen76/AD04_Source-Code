<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css?<%=System.currentTimeMillis()%>" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery-1.7.2.js"></script> -->
<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.js"></script>
<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/jquery.validate.js"></script>
<style>
	.error{
		color:red;
		padding-top : 8px;
	}
</style>
<script type="text/javascript">
function validateLogin(){
	var validator = $("#formLogin").validate({
    rules: {
    	maDN: "required",
    	pwd: "required"
    },
    messages: {
    	maDN:"Mã đăng nhập không được trống",
    	pwd:"Password không được trống",
    }
});
}
</script>
</head>
<body>
    <div class=col-md-4></div>
    <div class=col-md-4 style="padding-top:100px">
	    <div class="panel panel-default">
		    <div class="panel-heading text-center" ><h2>Đăng nhập</h2></div>
		    <div class="panel-body" >
		    <table >
                <tr>
                    <td style="color: red;">${message}</td>
                </tr>
                <tr>
                    <td style="color: blue;">${messLogout}</td>
                </tr>
            </table>
			<form action="LoginServlet" method="post" id="formLogin" name="formLogin"  >
		        <div class="form-group">
		          <label>Mã đăng nhập:</label>
		          <input type="text" class="form-control" name="maDN" id="maDN">
		          <p style="font-style: italic; color: red;">${messageMaDN} </p>
		        </div>
				<div class="form-group">
			        <label>Mật khẩu:</label>
					<input type="password" class="form-control" name="pwd" id="pwd">
					<p style="font-style: italic; color: red;">${messagePass} </p>
		        </div>
		        <input type="submit" value="Đăng nhập" class="btn btn-primary pull-right" onclick="validateLogin();">
			</form>
		  	</div>
	  	</div>
  	</div>
    <div class=col-md-4></div>
</body>
</html>