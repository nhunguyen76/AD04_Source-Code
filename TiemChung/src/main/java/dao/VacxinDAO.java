package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.HoChanNuoi;
import entities.Vacxin;


public class VacxinDAO {
  static Connection currentCon = null;
  static ResultSet rs = null;
  static String sql = "";
  
  public static List<Vacxin> getAll(){
    sql = "select * from Vacxin";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    List<Vacxin> list = new ArrayList<Vacxin>();
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
    	String maVX = rs.getString("MaVX"); 
    	String tenVX = rs.getString("TenVX");
    	int soLuong = rs.getInt("SoLuong");
    	String donViTinh = rs.getString("DonViTinh");
    	String chucNang = rs.getString("ChucNang");
    	String thanhPhan = rs.getString("ThanhPhan");
    	String cachDung = rs.getString("CachDung");
    	String phanUngPhu = rs.getString("PhanUngPhu");
    	String baoQuan = rs.getString("BaoQuan");
    	String xuatXu = rs.getString("XuatXu");
    	String hinhAnh = rs.getString("HinhAnh");
    	String chiDinh = rs.getString("ChiDinh");
    	String chuY = rs.getString("ChuY");
    	Vacxin vacxin = new Vacxin(maVX, tenVX, soLuong, donViTinh, chucNang, 
    			thanhPhan, cachDung, phanUngPhu, baoQuan, xuatXu, hinhAnh, chiDinh, chuY);
        list.add(vacxin);
      }
      return list;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
    }
    return null;
  }
}
