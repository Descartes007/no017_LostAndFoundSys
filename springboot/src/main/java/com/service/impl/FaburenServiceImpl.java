package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FaburenDao;
import com.entity.FaburenEntity;
import com.service.FaburenService;
import com.entity.vo.FaburenVO;
import com.entity.view.FaburenView;

@Service("faburenService")
public class FaburenServiceImpl extends ServiceImpl<FaburenDao, FaburenEntity> implements FaburenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FaburenEntity> page = this.selectPage(
                new Query<FaburenEntity>(params).getPage(),
                new EntityWrapper<FaburenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FaburenEntity> wrapper) {
		  Page<FaburenView> page =new Query<FaburenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FaburenVO> selectListVO(Wrapper<FaburenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FaburenVO selectVO(Wrapper<FaburenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FaburenView> selectListView(Wrapper<FaburenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FaburenView selectView(Wrapper<FaburenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
