package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class LogoutController  extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  
  @RequestMapping(value = "/login")
  public String login(HttpServletRequest request, HttpServletResponse response)  
      throws ServletException, IOException {
    return "redirect:index.jsp";
  }
  
  @RequestMapping(value = "/logout")
  public String logout(HttpServletRequest request, HttpServletResponse response,Model model)  
      throws ServletException, IOException {
    response.setContentType("text/html");
    HttpSession session = request.getSession(false);
    if(session != null){
      session.invalidate();
    }
    model.addAttribute("messLogout", "Bạn đã đăng xuất thành công.");
    return "index.jsp";
  }
  
  
}  
