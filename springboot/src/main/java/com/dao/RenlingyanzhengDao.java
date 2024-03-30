package com.dao;

import com.entity.RenlingyanzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenlingyanzhengVO;
import com.entity.view.RenlingyanzhengView;


/**
 * 认领验证
 * 
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface RenlingyanzhengDao extends BaseMapper<RenlingyanzhengEntity> {
	
	List<RenlingyanzhengVO> selectListVO(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
	
	RenlingyanzhengVO selectVO(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
	
	List<RenlingyanzhengView> selectListView(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);

	List<RenlingyanzhengView> selectListView(Pagination page,@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
	
	RenlingyanzhengView selectView(@Param("ew") Wrapper<RenlingyanzhengEntity> wrapper);
	

}
