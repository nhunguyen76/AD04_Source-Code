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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import dao.HoChanNuoiDAO;
import dao.LoaiGSGCDAO;
import dao.VacxinDAO;
import entities.HoChanNuoi;
import entities.LoaiGSGC;
import entities.Vacxin;
@Controller
@RequestMapping("/loaiGSGC")
public class LoaiGSGCController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @RequestMapping(value= {""})
  public String getAllList(Model model) {
    List<LoaiGSGC> listLoaiGSGC = new ArrayList<LoaiGSGC>();
    listLoaiGSGC = LoaiGSGCDAO.getAll();
    model.addAttribute("listLoaiGSGC", listLoaiGSGC);
    return "/WEB-INF/views/danhSachLoaiGSGC.jsp";   
  }
  
}
