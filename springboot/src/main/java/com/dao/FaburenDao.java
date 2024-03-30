package com.dao;

import com.entity.FaburenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FaburenVO;
import com.entity.view.FaburenView;


/**
 * 发布人
 * 
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface FaburenDao extends BaseMapper<FaburenEntity> {
	
	List<FaburenVO> selectListVO(@Param("ew") Wrapper<FaburenEntity> wrapper);
	
	FaburenVO selectVO(@Param("ew") Wrapper<FaburenEntity> wrapper);
	
	List<FaburenView> selectListView(@Param("ew") Wrapper<FaburenEntity> wrapper);

	List<FaburenView> selectListView(Pagination page,@Param("ew") Wrapper<FaburenEntity> wrapper);
	
	FaburenView selectView(@Param("ew") Wrapper<FaburenEntity> wrapper);
	

}
