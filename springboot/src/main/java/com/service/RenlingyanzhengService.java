package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenlingyanzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenlingyanzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenlingyanzhengView;


/**
 * 认领验证
 *
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface RenlingyanzhengService extends IService<RenlingyanzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenlingyanzhengVO> selectListVO(Wrapper<RenlingyanzhengEntity> wrapper);
   	
   	RenlingyanzhengVO selectVO(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
   	
   	List<RenlingyanzhengView> selectListView(Wrapper<RenlingyanzhengEntity> wrapper);
   	
   	RenlingyanzhengView selectView(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenlingyanzhengEntity> wrapper);
   	

}

