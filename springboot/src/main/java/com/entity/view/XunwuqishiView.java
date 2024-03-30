package com.entity.view;

import com.entity.XunwuqishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 寻物启事
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("xunwuqishi")
public class XunwuqishiView  extends XunwuqishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XunwuqishiView(){
	}
 
 	public XunwuqishiView(XunwuqishiEntity xunwuqishiEntity){
 	try {
			BeanUtils.copyProperties(this, xunwuqishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
