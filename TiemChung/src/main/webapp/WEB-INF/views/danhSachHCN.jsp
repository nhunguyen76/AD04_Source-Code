<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css?<%=System.currentTimeMillis()%>" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>

<body>

	<%@ include file="header.jsp" %>
	<div class="container-fluid main-container">
	<%@ include file="sidebarLeft.jsp" %>
		<div class="col-md-9">
			<div class="panel panel-default">
 		 		<div class="panel-body " id="contentPage">
 		 			<h1>Danh sách hộ chăn nuôi</h1>
 		 			<form class="" action=""  method="GET" >
					<div class="form-group text-right" >
						Tìm theo : 
						<select>
							<option>Tên chủ hộ</option>
							<option>Mã hộ</option>
						</select>
						<input type="text" name="keyword"  placeholder="Tìm hộ chăn nuôi">
						<button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
					</div>
					</form>
    				<table id="tableList"> 
						<thead>
						<tr>
							<th>Mã hộ</th>
							<th>Tên chủ hộ</th>
							<th>Ngày sinh</th>
							<th>Địa chỉ</th>
							<th>SĐT</th>
							<th>Chi tiết</th>
							<th>Tác vụ</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${listHCN}" var="hcn">
						<tr>
						  <td>${hcn.maHo}</td>
						  <td>${hcn.tenChuHo}</td>
						  <td>${hcn.ngaySinh}</td>
				    	  <td>${hcn.diaChi}</td>
						  <td>${hcn.sdt}</td>
						  <td>
							<a title="Vật nuôi" class="btn btn-primary"
							  href="${pageContext.request.contextPath}/ho_chan_nuoi/chiTiet?id=${hcn.maHo}" >
							  <i class="glyphicon glyphicon-eye-open"></i>
							</a>
						  </td>
						  <td>
							<a onclick="return confirm('Bạn muốn xóa không ?')" title="Xóa" class="btn btn-danger"
							  href="${pageContext.request.contextPath}/nhan_vien/xoa?id=${hcn.maHo}">
							  <i class="glyphicon glyphicon-remove-circle"></i>
					 		</a>
							</td>
						</tr>
						</c:forEach>	
						</tbody>	
					</table>
 	 			</div>
			</div>
		</div>
	</div>
</body>
</html>