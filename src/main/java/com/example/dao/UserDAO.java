package com.example.dao;

import java.sql.*;
import com.example.common.JDBCUtil;
import com.example.vo.UserVO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public UserVO getUser(UserVO vo) {
        UserVO user = null;
        try { conn = JDBCUtil.getConnection();
            String sql = " select * from users where id=? and password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, vo.getId());
            stmt.setString(2, vo.getPassword());
            rs = stmt.executeQuery();
            if(rs.next()){
                user = new UserVO();
                user.setId(rs.getString("ID"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setName(rs.getString("NAME"));
                user.setRole(rs.getString("ROLE"));
            }
        } catch (Exception e) { e.printStackTrace();
        } finally { JDBCUtil.close(rs, stmt, conn);
        }
        return user;
    }

}
