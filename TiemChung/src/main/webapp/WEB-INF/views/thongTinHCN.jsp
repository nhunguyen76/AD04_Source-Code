<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery_technicalkeeda.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.validate.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css?<%=System.currentTimeMillis()%>" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<head>
<body>  
  <%@ include file="header.jsp" %>
  <div class="container-fluid main-container">
  <%@ include file="sidebarLeft.jsp" %>
	<div class="col-md-9">
	  <div class="panel panel-default">
 	    <div class="panel-body">
          <h2>Thông tin hộ chăn nuôi</h2>
          <h5 class="notifyMessage">${message}</h5>
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
    	  
    	  <h2>Gia súc, gia cầm của hộ</h2>
    	  <table id="tableList"> 
						<thead>
						<tr>
							<th>Mã </th>
							<th>Tên loài</th>
							<th>Số lượng</th>
							<th>Lịch sử tiêm chủng</th>
							<th>Tác vụ</th>
						</tr>
						</thead>
						<tbody>
						<c:forEach items="${listGSGC}" var="gsgc">
						<tr>
						  <td>${gsgc.maGSGC_HCN}</td>
						  <td>${gsgc.tenGSGC}</td>
						  <td>${gsgc.soLuong}</td>
				    	  <td>Xem</td>
						  <td>
							<a title="Vật nuôi" class="btn btn-primary"
							  href="${pageContext.request.contextPath}/ho_chan_nuoi/chiTiet?id=${gsgc.maHo}" >
							  <i class="glyphicon glyphicon-edit"></i>
							</a>
							<a onclick="return confirm('Bạn muốn xóa không ?')" title="Xóa" class="btn btn-danger"
							  href="${pageContext.request.contextPath}/nhan_vien/xoa?id=${gsgc.maHo}">
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