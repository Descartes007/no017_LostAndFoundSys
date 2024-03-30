package com.entity.view;

import com.entity.RenlingyanzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 认领验证
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("renlingyanzheng")
public class RenlingyanzhengView  extends RenlingyanzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenlingyanzhengView(){
	}
 
 	public RenlingyanzhengView(RenlingyanzhengEntity renlingyanzhengEntity){
 	try {
			BeanUtils.copyProperties(this, renlingyanzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
