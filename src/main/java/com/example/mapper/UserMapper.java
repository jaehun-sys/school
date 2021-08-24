package com.example.mapper;

import java.util.List;
import com.example.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper

public interface UserMapper {
    List<UserVO> getUserList();
    UserVO getUser(UserVO user);
    int createUser(UserVO user);
    int updateUser(UserVO user);
    int deleteUser(UserVO user);
}