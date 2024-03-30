package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FaburenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FaburenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FaburenView;


/**
 * 发布人
 *
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface FaburenService extends IService<FaburenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FaburenVO> selectListVO(Wrapper<FaburenEntity> wrapper);
   	
   	FaburenVO selectVO(@Param("ew") Wrapper<FaburenEntity> wrapper);
   	
   	List<FaburenView> selectListView(Wrapper<FaburenEntity> wrapper);
   	
   	FaburenView selectView(@Param("ew") Wrapper<FaburenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FaburenEntity> wrapper);
   	

}

