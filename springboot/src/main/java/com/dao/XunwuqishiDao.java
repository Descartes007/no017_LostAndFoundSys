package com.dao;

import com.entity.XunwuqishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XunwuqishiVO;
import com.entity.view.XunwuqishiView;


/**
 * 寻物启事
 * 
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface XunwuqishiDao extends BaseMapper<XunwuqishiEntity> {
	
	List<XunwuqishiVO> selectListVO(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	XunwuqishiVO selectVO(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	List<XunwuqishiView> selectListView(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);

	List<XunwuqishiView> selectListView(Pagination page,@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	
	XunwuqishiView selectView(@Param("ew") Wrapper<XunwuqishiEntity> wrapper);
	

}
