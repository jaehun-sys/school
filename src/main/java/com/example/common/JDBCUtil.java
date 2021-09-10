package com.example.common;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(
            "jdbc:mariadb://ec2-54-180-157-48.ap-northeast-2.compute.amazonaws.com/INFDB_AWS",
            "INFLUENCER",     // userid 
            "INSTAGRAM12#$"); //userpassword
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }
        
    public static void close(PreparedStatement stmt, Connection conn) {
        close(null,stmt,conn);
    }
        
    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn){ 
        try {
            if(rs != null)rs.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally { rs = null; }
        
        try {
            if(stmt != null) stmt.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {stmt = null; }
        
        try {
            if(conn != null)conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {conn = null; }
    }
}
