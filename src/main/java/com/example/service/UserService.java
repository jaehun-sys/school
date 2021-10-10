package com.example.service;
import com.example.mapper.UserMapper;
import com.example.mapper.InfRateMapper;
import com.example.vo.UserVO;
import com.example.vo.inf_fol_rateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper mapper;

    @Autowired
    public InfRateMapper mapper2;

    public List<UserVO> getUserList() {
        return mapper.getUserList();
    }
    
    public UserVO getUser(UserVO user) {
        return mapper.getUser(user);
    }

    public UserVO loginUser(UserVO user){
        return mapper.loginUser(user);
    }

    public inf_fol_rateVO getInfFolRate(inf_fol_rateVO irate){
        return mapper2.getInfFolRate(irate);
    }
}