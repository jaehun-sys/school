package com.example.mapper;

import java.util.List;
import com.example.vo.inf_fol_rateVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface InfRateMapper {

    List<inf_fol_rateVO> getInfFolRateList();
    inf_fol_rateVO getInfFolRate(inf_fol_rateVO inf_fol_rate);
    inf_fol_rateVO createInfFolRate(inf_fol_rateVO inf_fol_rate);
    inf_fol_rateVO updateInfFolRate(inf_fol_rateVO inf_fol_rate);
    inf_fol_rateVO deleteInfFolRate(inf_fol_rateVO inf_fol_rate);

}