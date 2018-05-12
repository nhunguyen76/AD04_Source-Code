<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

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
#nav li ul {
list-style-type: none;
    display: none; // used to hide sub-menus
}
#nav li ul li a {
    padding: 10px 25px;
    background: #ececec;
    border-bottom: 1px dotted #ccc;
}
</style>

<script>
$(document).ready(function () {
	  $('#nav > li > a').click(function(){
	    if ($(this).attr('class') != 'active'){
	      $('#nav li ul').slideUp();
	      $(this).next().slideToggle();
	      $('#nav li a').removeClass('active');
	      $(this).addClass('active');
	    }
	  });
	});
</script>
<div class="col-md-3 sidebar">
	<ul id="nav"  class="nav nav-pills nav-stacked">
		<li><a href="#" >Trang chủ</a></li>
  		<li><a href="#" >Quản lí thông tin hộ chăn nuôi</a>
			<ul>
		      <li><a href="${pageContext.request.contextPath}/ho_chan_nuoi" >Danh sách hộ chăn nuôi</a></li>
		      <li><a href="" >Tạo mới tài khoản</a></li>
		      <li><a href="" >Hộp thư</a></li>
		    </ul>
		</li>
		<li><a href="${pageContext.request.contextPath}/vacxin">Quản lí các loại vắc-xin</a></li>
		<li><a href="${pageContext.request.contextPath}/loaiGSGC">Quản lí các loại gia súc, gia cầm</a></li>
		<li><a href="#">Quản lí việc khám chỉ định vắc-xin</a>
			<ul>
				<li><a href="" >Thông tin kiểm khám</a></li>
		      	<li><a href="" >Lập kế hoạch  tiêm chủng</a></li>
		      	<li><a href="" >Lịch tiêm chủng</a></li>
		      	<li><a href="" >Lich sử tiêm chủng</a></li>
		    </ul>
		</li>
		<li><a href="#">Thống kê, báo cáo</a>
			<ul>
				<li><a href="" >Số lượng vắc xin</a></li>
		      	<li><a href="" >Số lần tiêm chủng</a></li>
		    </ul>
		</li>
		<li><a href="#">Thông tin cá nhân</a>
			<ul>
				<li><a href="" >Thông tin cá nhân</a></li>
		      	<li><a href="" >Đổi mật khẩu</a></li>
		    </ul>	
		</li>
	</ul>
	
</div>

		