package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.GSGC_HCN;
import entities.LoaiGSGC;


public class GSGC_HCNDAO {
  static Connection currentCon = null;
  static ResultSet rs = null;
  static String sql = "";
  
  public static List<GSGC_HCN> getByMaHo(String id){
    sql = "select * from GSGC_HCN where MaHo='"+id+"'";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    List<GSGC_HCN> list = new ArrayList<GSGC_HCN>();
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
        String maGSGC_HCN = rs.getString("MaGSGC_HCN");
        String maHo = rs.getString("MaHo");
        int soLuong = rs.getInt("SoLuong");
        String maGSGC = rs.getString("MaGSGC");
        String tenGSGC = LoaiGSGCDAO.getById(maGSGC).getTenLoai();
        GSGC_HCN gsgc_hcn = new GSGC_HCN(maGSGC_HCN, maHo, soLuong, maGSGC, tenGSGC);
        list.add(gsgc_hcn);
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
