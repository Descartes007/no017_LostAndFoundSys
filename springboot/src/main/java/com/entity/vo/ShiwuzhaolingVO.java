package com.entity.vo;

import com.entity.ShiwuzhaolingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 失物招领
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
public class ShiwuzhaolingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品类别
	 */
	
	private String wupinleibie;
		
	/**
	 * 物品数量
	 */
	
	private Integer wupinshuliang;
		
	/**
	 * 物品图片
	 */
	
	private String wupintupian;
		
	/**
	 * 丢失地点
	 */
	
	private String diushididian;
		
	/**
	 * 拾得时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shideshijian;
		
	/**
	 * 当前位置
	 */
	
	private String dangqianweizhi;
		
	/**
	 * 物品描述
	 */
	
	private String wupinmiaoshu;
		
	/**
	 * 发布人账号
	 */
	
	private String faburenzhanghao;
		
	/**
	 * 发布人姓名
	 */
	
	private String faburenxingming;
		
	/**
	 * 电话号码
	 */
	
	private String dianhuahaoma;
		
	/**
	 * 校区
	 */
	
	private String xiaoqu;
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品类别
	 */
	 
	public void setWupinleibie(String wupinleibie) {
		this.wupinleibie = wupinleibie;
	}
	
	/**
	 * 获取：物品类别
	 */
	public String getWupinleibie() {
		return wupinleibie;
	}
				
	
	/**
	 * 设置：物品数量
	 */
	 
	public void setWupinshuliang(Integer wupinshuliang) {
		this.wupinshuliang = wupinshuliang;
	}
	
	/**
	 * 获取：物品数量
	 */
	public Integer getWupinshuliang() {
		return wupinshuliang;
	}
				
	
	/**
	 * 设置：物品图片
	 */
	 
	public void setWupintupian(String wupintupian) {
		this.wupintupian = wupintupian;
	}
	
	/**
	 * 获取：物品图片
	 */
	public String getWupintupian() {
		return wupintupian;
	}
				
	
	/**
	 * 设置：丢失地点
	 */
	 
	public void setDiushididian(String diushididian) {
		this.diushididian = diushididian;
	}
	
	/**
	 * 获取：丢失地点
	 */
	public String getDiushididian() {
		return diushididian;
	}
				
	
	/**
	 * 设置：拾得时间
	 */
	 
	public void setShideshijian(Date shideshijian) {
		this.shideshijian = shideshijian;
	}
	
	/**
	 * 获取：拾得时间
	 */
	public Date getShideshijian() {
		return shideshijian;
	}
				
	
	/**
	 * 设置：当前位置
	 */
	 
	public void setDangqianweizhi(String dangqianweizhi) {
		this.dangqianweizhi = dangqianweizhi;
	}
	
	/**
	 * 获取：当前位置
	 */
	public String getDangqianweizhi() {
		return dangqianweizhi;
	}
				
	
	/**
	 * 设置：物品描述
	 */
	 
	public void setWupinmiaoshu(String wupinmiaoshu) {
		this.wupinmiaoshu = wupinmiaoshu;
	}
	
	/**
	 * 获取：物品描述
	 */
	public String getWupinmiaoshu() {
		return wupinmiaoshu;
	}
				
	
	/**
	 * 设置：发布人账号
	 */
	 
	public void setFaburenzhanghao(String faburenzhanghao) {
		this.faburenzhanghao = faburenzhanghao;
	}
	
	/**
	 * 获取：发布人账号
	 */
	public String getFaburenzhanghao() {
		return faburenzhanghao;
	}
				
	
	/**
	 * 设置：发布人姓名
	 */
	 
	public void setFaburenxingming(String faburenxingming) {
		this.faburenxingming = faburenxingming;
	}
	
	/**
	 * 获取：发布人姓名
	 */
	public String getFaburenxingming() {
		return faburenxingming;
	}
				
	
	/**
	 * 设置：电话号码
	 */
	 
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
				
	
	/**
	 * 设置：校区
	 */
	 
	public void setXiaoqu(String xiaoqu) {
		this.xiaoqu = xiaoqu;
	}
	
	/**
	 * 获取：校区
	 */
	public String getXiaoqu() {
		return xiaoqu;
	}
			
}
