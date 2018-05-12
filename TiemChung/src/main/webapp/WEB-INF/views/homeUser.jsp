<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<style>
	*{margin:0;padding:0}
#nav li a {
    display: block;
    border-top: 1px solid #eee;
    /* border-bottom: 1px solid #999; */
    background: #DCDCDC;
    color: #000;
}
#nav li a:hover, #nav li a.active {
    background: #999;
    color: #fff;
}
#nav li ul li a {
    padding: 10px 25px;
    background: #ececec;
    border-bottom: 1px dotted #ccc;
}
</style>

<script>
$(document).ready(function () {
	 $('#nav li').first().addClass("active").find('ul').show();
	});
</script>
</head>

<body>
	<%@ include file="header.jsp" %>
	<div class="container-fluid main-container">
		<div class="col-md-3 sidebar">
			<ul id="nav"  class="nav nav-pills nav-stacked">
		  		<li><a href="#" class="active">Thông tin cá nhân</a></li>
				<li><a href="#">Quản lí gia súc, gia cầm</a></li>
				<li><a href="#">Gửi thư yêu cầu</a></li>
				<li><a href="#">Đổi mật khẩu</a></li>
			</ul>
		</div>
		<div class="col-md-9">
			<div class="panel panel-default">
 		 		<div class="panel-body ">
    				<h2>Thông tin hộ chăn nuôi</h2>
			    	<form action="${pageContext.request.contextPath}/ho_chan_nuoi/capNhat" method="post">
		            <table class="tableForm">
		            	<tr>
		    				<td><label>Mã Hộ</label></td>
		    				<td> 
		    				<input class="form-control" type="text" name="maHo" id="maHo"
		                            value="${hcn.maHo}" readonly>
		    				</td>
		    			</tr>
		    			<tr>
		    				<td><label>Tên chủ hộ</label></td>
		    				<td> 
		    				<input class="form-control" type="text" name="tenChuHo" id="tenChuHo"
		                            value="${hcn.tenChuHo}">
		    				</td>
		    			</tr>
		    			<tr>
		    				<td><label>Ngày sinh</label></td>
		    				<td> 
		    				<input class="form-control" type="text" name="ngaySinh" id="ngaySinh"
		                            value="${hcn.ngaySinh}">
		    				</td>
		    			</tr>
		    			<tr>
		    				<td><label>Địa chỉ</label></td>
		    				<td> 
		    				<input class="form-control" type="text" name="diaChi" id="diaChi"
		                            value="${hcn.diaChi}">
		    				</td>
		    			</tr>
		    			<tr>
		    				<td><label>Số điện thoại</label></td>
		    				<td> 
		    				<input class="form-control" type="text" name="sdt" id="sdt"
		                            value="${hcn.sdt}">
		    				</td>
		    			</tr>
		    			<tr>
		            		<td></td>
		            		<td>
		            			<input type="submit" value="Cập nhật" class="btn btn-primary" >
		            		</td>
		            	</tr>
		            </table>
			    	</form>
			    	
 	 			</div>
			</div>
		</div>
	</div>
</body>
</html>