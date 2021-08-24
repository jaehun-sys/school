package com.example.service;
import com.example.mapper.UserMapper;
import com.example.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper mapper;

    public List<UserVO> getUserList() {
        return mapper.getUserList();
    }
    
    public UserVO getUser(UserVO user) {
        return mapper.getUser(user);
    }
}