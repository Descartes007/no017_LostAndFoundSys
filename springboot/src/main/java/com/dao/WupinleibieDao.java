package com.dao;

import com.entity.WupinleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinleibieVO;
import com.entity.view.WupinleibieView;


/**
 * 物品类别
 * 
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public interface WupinleibieDao extends BaseMapper<WupinleibieEntity> {
	
	List<WupinleibieVO> selectListVO(@Param("ew") Wrapper<WupinleibieEntity> wrapper);
	
	WupinleibieVO selectVO(@Param("ew") Wrapper<WupinleibieEntity> wrapper);
	
	List<WupinleibieView> selectListView(@Param("ew") Wrapper<WupinleibieEntity> wrapper);

	List<WupinleibieView> selectListView(Pagination page,@Param("ew") Wrapper<WupinleibieEntity> wrapper);
	
	WupinleibieView selectView(@Param("ew") Wrapper<WupinleibieEntity> wrapper);
	

}
