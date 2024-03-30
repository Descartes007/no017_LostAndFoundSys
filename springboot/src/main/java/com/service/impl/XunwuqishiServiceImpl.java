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


import com.dao.XunwuqishiDao;
import com.entity.XunwuqishiEntity;
import com.service.XunwuqishiService;
import com.entity.vo.XunwuqishiVO;
import com.entity.view.XunwuqishiView;

@Service("xunwuqishiService")
public class XunwuqishiServiceImpl extends ServiceImpl<XunwuqishiDao, XunwuqishiEntity> implements XunwuqishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XunwuqishiEntity> page = this.selectPage(
                new Query<XunwuqishiEntity>(params).getPage(),
                new EntityWrapper<XunwuqishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XunwuqishiEntity> wrapper) {
		  Page<XunwuqishiView> page =new Query<XunwuqishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XunwuqishiVO> selectListVO(Wrapper<XunwuqishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XunwuqishiVO selectVO(Wrapper<XunwuqishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XunwuqishiView> selectListView(Wrapper<XunwuqishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XunwuqishiView selectView(Wrapper<XunwuqishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
