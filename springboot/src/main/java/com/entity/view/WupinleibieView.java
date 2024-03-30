package com.entity.view;

import com.entity.WupinleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("wupinleibie")
public class WupinleibieView  extends WupinleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinleibieView(){
	}
 
 	public WupinleibieView(WupinleibieEntity wupinleibieEntity){
 	try {
			BeanUtils.copyProperties(this, wupinleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
