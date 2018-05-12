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
 		 			<h1>Danh sách loại gia súc, gia cầm</h1>
 		 			
 		 			<a class="btn btn-md btn-primary" href="${pageContext.request.contextPath}/nhan_vien/addForm">
 		 			<i class="glyphicon glyphicon-plus-sign"></i><span>Thêm mới</span>
         			</a> 
    				<table id="tableList"> 
						<thead>
						<tr>
							<th>Mã </th>
							<th>Tên loại</th>
							<th>Môi trường sống</th>
							<th>Cân nặng trung bình</th>
							<th>Số năm sống trung bình</th>
							<th>Tác vụ</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${listLoaiGSGC}" var="loai">
						<tr>
						  <td>${loai.maGSGC}</td>
						  <td>${loai.tenLoai}</td>
						  <td>${loai.mtSong}</td>
				    	  <td>${loai.canNangTB}</td>
						  <td>${loai.soNamSongTB}</td>
						  <td>
							<a title="Chỉnh sửa" class="btn btn-primary"
							  href="${pageContext.request.contextPath}/nhan_vien/formChinhSua?id=${loai.maGSGC}" >
							  <i class="glyphicon glyphicon-edit"></i>
							</a>
							<a onclick="return confirm('Bạn muốn xóa không ?')" title="Xóa" class="btn btn-danger"
							  href="${pageContext.request.contextPath}/nhan_vien/xoa?id=${loai.maGSGC}">
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