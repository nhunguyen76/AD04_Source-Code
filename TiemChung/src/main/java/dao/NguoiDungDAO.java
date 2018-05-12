package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.NguoiDung;
 
public class NguoiDungDAO { 
  static Connection currentCon = null;
  static ResultSet rs = null; 
  static String sql = "";
  
  public static NguoiDung isValid(String username, String password) {
    ConnectionManager connectionManager = ConnectionManager.getInstance();
    PreparedStatement ps = null;
    sql = "select * from NguoiDung where maDangNhap=? and password=?";
    try {
      currentCon = connectionManager.getConnection();
      ps = currentCon.prepareStatement(sql);
      ps.setString(1,username);
      ps.setString(2,password);
      rs = ps.executeQuery();
      if(rs != null && rs.next()){
    	  NguoiDung user = new NguoiDung(rs.getString("maDangNhap"),rs.getString("password"),rs.getString("role"));
      return user;    
      }
      else {
        return null;
      }
      
    }catch(Exception ex) {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
    }
    return null;
  }
}
