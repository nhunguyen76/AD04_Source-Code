package controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import dao.GSGC_HCNDAO;
import dao.HoChanNuoiDAO;
import entities.GSGC_HCN;
import entities.HoChanNuoi;
@Controller
@RequestMapping("/ho_chan_nuoi")
public class HoChanNuoiController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @RequestMapping(value= {""})
  public String getAllList(Model model) {
    List<HoChanNuoi> listHCN = new ArrayList<HoChanNuoi>();
    listHCN = HoChanNuoiDAO.getAll();
    model.addAttribute("listHCN", listHCN);
    return "/WEB-INF/views/danhSachHCN.jsp";   
  }
  
  @RequestMapping(value= {"/chiTiet"})
  public String showInfo(@RequestParam("id") String id, Model model) {
    HoChanNuoi hcn = HoChanNuoiDAO.getById(id);
    model.addAttribute("hcn", hcn);
    List<GSGC_HCN> gsgc_hcn = GSGC_HCNDAO.getByMaHo(id);
    model.addAttribute("listGSGC", gsgc_hcn);
    return "/WEB-INF/views/thongTinHCN.jsp";   
  }
  
  @RequestMapping(value = "capNhat")
  public void edit(Model model,HttpServletRequest request,  HttpServletResponse response) 
		  throws ServletException, IOException{   
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String msg = null;
    String maHo = request.getParameter("maHo");
    String tenChuHo = request.getParameter("tenChuHo");
    String ngaySinh = request.getParameter("ngaySinh");
    String diaChi = request.getParameter("diaChi");
    String sdt = request.getParameter("sdt");
    HoChanNuoi hcn = new HoChanNuoi(maHo, tenChuHo, ngaySinh, diaChi, sdt);
    int status = HoChanNuoiDAO.editInfo(hcn);
    if(status != 0) {
      msg= "Chỉnh sửa thành công";
    }else {
      msg= "Lỗi! Chưa sửa được";
    }
    hcn = HoChanNuoiDAO.getById(maHo);
    model.addAttribute("hcn", hcn);
    request.setAttribute("message", msg);
    request.getRequestDispatcher("chiTiet?id="+hcn.getMaHo()).forward(request, response);
  }
}
