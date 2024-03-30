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


import com.dao.RenlingyanzhengDao;
import com.entity.RenlingyanzhengEntity;
import com.service.RenlingyanzhengService;
import com.entity.vo.RenlingyanzhengVO;
import com.entity.view.RenlingyanzhengView;

@Service("renlingyanzhengService")
public class RenlingyanzhengServiceImpl extends ServiceImpl<RenlingyanzhengDao, RenlingyanzhengEntity> implements RenlingyanzhengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenlingyanzhengEntity> page = this.selectPage(
                new Query<RenlingyanzhengEntity>(params).getPage(),
                new EntityWrapper<RenlingyanzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenlingyanzhengEntity> wrapper) {
		  Page<RenlingyanzhengView> page =new Query<RenlingyanzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenlingyanzhengVO> selectListVO(Wrapper<RenlingyanzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenlingyanzhengVO selectVO(Wrapper<RenlingyanzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenlingyanzhengView> selectListView(Wrapper<RenlingyanzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenlingyanzhengView selectView(Wrapper<RenlingyanzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
