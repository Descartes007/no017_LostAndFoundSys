package com.entity.view;

import com.entity.FaburenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发布人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("faburen")
public class FaburenView  extends FaburenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FaburenView(){
	}
 
 	public FaburenView(FaburenEntity faburenEntity){
 	try {
			BeanUtils.copyProperties(this, faburenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
