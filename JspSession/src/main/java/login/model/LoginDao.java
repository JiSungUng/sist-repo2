package login.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mysql.db.DbConnect;

public class LoginDao {
   DbConnect db = new DbConnect();
   
   //id통해서 name값 얻기
   public String getName(String id)
   {
      String name ="";
      
      Connection conn = db.getConnection();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "select * from login where id=?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, id);
         rs = pstmt.executeQuery();
         if(rs.next())
         {
            name = rs.getString("name");
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         db.dbClose(rs, pstmt, conn);
      }
      
      return name;
   }
   
   
   //id에 맞는 pass인지 확인하는 메서드
   public boolean isLogin(String id, String pass) {
      boolean flag = false;   //기본은 false 맞으면 true
      
      Connection conn = db.getConnection();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "select * from login where id=? and pass=?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, id);
         pstmt.setString(2, pass);
         
         rs = pstmt.executeQuery();
         if(rs.next())
         {
            flag = true; //비밀번호가 맞으면 true
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         db.dbClose(rs, pstmt, conn);
      }
      
      return flag;
   }
}