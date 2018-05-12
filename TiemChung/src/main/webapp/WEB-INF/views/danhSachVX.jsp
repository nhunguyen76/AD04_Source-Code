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
 		 			<h1>Danh sách vắc-xin</h1>
 		 			
 		 			<a class="btn btn-md btn-primary" href="${pageContext.request.contextPath}/phong_ban/addForm">
 		 			<i class="glyphicon glyphicon-plus-sign"></i>
 		 			<span>Thêm vắc-xin</span>
         			</a> 
    				<table id="tableList" > 
						
						<tr>
							<th>Mã vắc-xin</th>
							<th>Tên vắc-xin</th>
							<th>Số lượng</th>
							<th>Đơn vị tính</th>
							<th>Sản xuất</th>
							<th>Chức năng</th>
							<th>Tác vụ</th>
						</tr>
						
						<c:forEach items="${listVX}" var="vacxin">
						<tr>
							<td>${vacxin.maVX}</td>
							<td>${vacxin.tenVX}</td>
							<td>${vacxin.soLuong}</td>
							<td>${vacxin.donViTinh}</td>
							<td>${vacxin.xuatXu}</td>
							<td>${vacxin.chucNang}</td>
							<td>
								<a title="Chỉnh sửa" class="btn btn-primary"
								href="${pageContext.request.contextPath}/phong_ban/formChinhSua?id=${vacxin.maVX}" >
								Chỉnh sửa <i class="glyphicon glyphicon-edit"></i>
								</a>
							</td>
						</tr>
						</c:forEach>	
							
					</table>
 	 			</div>
			</div>
		</div>
	</div>
</body>
</html>