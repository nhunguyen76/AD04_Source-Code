<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	<div class="navbar navbar-default navbar-static-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">
					QUẢN LÝ TIÊM CHỦNG ĐỊA PHƯƠNG
				</a>
			</div>
	
			<div class="collapse navbar-collapse" id="">			
				      
				<div class="nav navbar-text navbar-right" style="margin-right: 10px;">
                    <label>Xin chào ! <%= session.getAttribute("currentUser") %></label>
					<a href="${pageContext.request.contextPath}/logout" >Đăng xuất </a>
					
				</div>
			</div>
		</div>
	</div>
