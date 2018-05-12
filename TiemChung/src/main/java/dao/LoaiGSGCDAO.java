package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.LoaiGSGC;


public class LoaiGSGCDAO {
  static Connection currentCon = null;
  static ResultSet rs = null;
  static String sql = "";
  
  public static List<LoaiGSGC> getAll(){
    sql = "select * from LoaiGSGC";
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    Statement stmt = null;
    List<LoaiGSGC> list = new ArrayList<LoaiGSGC>();
    try {
      currentCon = connectionManager.getConnection();
      stmt = currentCon.createStatement( );
      rs = stmt.executeQuery(sql);
      while(rs.next()) {
        String maGSGC = rs.getString("MaGSGC");
        String tenLoai = rs.getString("TenLoai");
        String mtSong = rs.getString("MTSong");
        String canNangTB = rs.getString("canNangTB");
        String soNamSongTB = rs.getString("soNamSongTB");
        
        LoaiGSGC loaiGSGC = new LoaiGSGC(maGSGC, tenLoai, mtSong, canNangTB, soNamSongTB);
        list.add(loaiGSGC);
      }
      return list;
    }catch(SQLException ex) {
      System.out.println(ex);
    }catch(NullPointerException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public static LoaiGSGC getById(String id) {
	    sql = "select * from LoaiGSGC where MaGSGC='"+id+"'";
	    ConnectionManager connectionManager = ConnectionManager.getInstance();
	    Statement stmt = null;
	    LoaiGSGC loaiGSGC = null;
	    try {
	      currentCon = connectionManager.getConnection();
	      stmt = currentCon.createStatement( );
	      rs = stmt.executeQuery(sql);
	      while(rs.next()) {
	    	  String maGSGC = rs.getString("MaGSGC");
	    	  String tenLoai = rs.getString("TenLoai");
	    	  String mtSong = rs.getString("MTSong");
	    	  String canNangTB = rs.getString("canNangTB");
	    	  String soNamSongTB = rs.getString("soNamSongTB");
	    	  loaiGSGC = new LoaiGSGC(maGSGC, tenLoai, mtSong, canNangTB, soNamSongTB);
	      }
	      return loaiGSGC;
	    }catch(SQLException ex) {
	      System.out.println(ex);
	    }catch(NullPointerException e) {
	      e.printStackTrace();
	  }
	  return null;
	  }
  
}
