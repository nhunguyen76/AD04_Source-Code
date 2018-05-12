package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import dao.VacxinDAO;
import entities.Vacxin;
@Controller
@RequestMapping("/vacxin")
public class VacxinController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @RequestMapping(value= {""})
  public String getAllList(Model model) {
	  System.out.println(1);
    List<Vacxin> listVX = new ArrayList<Vacxin>();
    listVX = VacxinDAO.getAll();
    model.addAttribute("listVX", listVX);
    return "/WEB-INF/views/danhSachVX.jsp";   
  }
  
}
