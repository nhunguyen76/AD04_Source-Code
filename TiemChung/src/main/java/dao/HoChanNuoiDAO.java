package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.HoChanNuoi;


public class HoChanNuoiDAO {
  static Connection currentCon = null;
  static ResultSet rs = null;
  static String sql = "";
  
  public static List<HoChanNuoi> getAll(){
    sql = "select * from HoChanNuoi";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    List<HoChanNuoi> list = new ArrayList<HoChanNuoi>();
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
    	String maHo = rs.getString("MaHo");
        String tenChuHo = rs.getString("TenChuHo");
        String ngaySinh = rs.getString("NgaySinh");
        String diaChi = rs.getString("DiaChi");
        String sdt = rs.getString("SDT");
        HoChanNuoi hoChanNuoi = new HoChanNuoi(maHo, tenChuHo, ngaySinh, diaChi, sdt);
        list.add(hoChanNuoi);
      }
      return list;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public static HoChanNuoi getById(String id) {
    sql = "select * from HoChanNuoi where MaHo='"+id+"'";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    HoChanNuoi hoChanNuoi = null;
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
    	  String maHo = rs.getString("MaHo");
          String tenChuHo = rs.getString("TenChuHo");
          String ngaySinh = rs.getString("NgaySinh");
          String diaChi = rs.getString("DiaChi");
          String sdt = rs.getString("SDT");
          hoChanNuoi = new HoChanNuoi(maHo, tenChuHo, ngaySinh, diaChi, sdt);
      }
      return hoChanNuoi;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
  }
  return null;
  }
  
  public static int editInfo(HoChanNuoi hcn) {
    sql = "update HoChanNuoi set TenChuHo=?, NgaySinh=?, DiaChi=?, " + 
        "SDT=? where MaHo = '"+hcn.getMaHo()+"'";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    PreparedStatement ps = null;
    int status = 0;
    try {
      currentCon = connectionManager.getConnection();
      ps = currentCon.prepareStatement(sql);
      ps.setString(1,hcn.getTenChuHo());
      ps.setString(2,hcn.getNgaySinh());
      ps.setString(3,hcn.getDiaChi());
      ps.setString(4,hcn.getSdt());
      status = ps.executeUpdate();
      return status;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
    }
    return status;
  }
  
}
