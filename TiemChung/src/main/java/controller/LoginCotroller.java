package controller;

import java.io.IOException;

import org.springframework.ui.Model;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.GSGC_HCNDAO;
import dao.HoChanNuoiDAO;
import dao.NguoiDungDAO;
import entities.GSGC_HCN;
import entities.HoChanNuoi;
import entities.NguoiDung;

@Controller
public class LoginCotroller{
  
  @RequestMapping(value = "/LoginServlet", method = RequestMethod.POST)
  protected String doPost(HttpServletRequest request, 
      HttpServletResponse response,Model model) throws ServletException, IOException {
	  HttpSession session = request.getSession();
    String username = request.getParameter("maDN");
    String password = request.getParameter("pwd");
   
    NguoiDung  user = NguoiDungDAO.isValid(username, password);
    if(user != null) {
    	if(user.getRole().contains("admin")) {
        	session.setAttribute("currentUser", "Admin");
        	return "/WEB-INF/views/homeAdmin.jsp"; 
        }else {
        	HoChanNuoi hcn = HoChanNuoiDAO.getById(username);
        	session.setAttribute("currentUser", hcn.getTenChuHo());
        	model.addAttribute("hcn", hcn);
        	return "/WEB-INF/views/homeUser.jsp";   
        }
    }else {
    	request.setAttribute("message", "Mã đăng nhập hoặc mật khẩu không đúng");
    	return "/WEB-INF/views/Login.jsp"; 
    }
  }
  
  @RequestMapping(value = "/test", method = RequestMethod.GET)
  protected void test(HttpServletRequest request,HttpServletResponse response) 
		  throws ServletException, IOException {
    	request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    
  }
}
