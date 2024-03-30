package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 认领验证
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-26 11:12:36
 */
@TableName("renlingyanzheng")
public class RenlingyanzhengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RenlingyanzhengEntity() {
		
	}
	
	public RenlingyanzhengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 认领编号
	 */
					
	private String renlingbianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 物品特征
	 */
					
	private String wupintezheng;
	
	/**
	 * 物品颜色
	 */
					
	private String wupinyanse;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 物品大小
	 */
					
	private String wupindaxiao;
	
	/**
	 * 认领时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date renlingshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 电话号码
	 */
					
	private String dianhuahaoma;
	
	/**
	 * 发布人账号
	 */
					
	private String faburenzhanghao;
	
	/**
	 * 发布人姓名
	 */
					
	private String faburenxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：认领编号
	 */
	public void setRenlingbianhao(String renlingbianhao) {
		this.renlingbianhao = renlingbianhao;
	}
	/**
	 * 获取：认领编号
	 */
	public String getRenlingbianhao() {
		return renlingbianhao;
	}
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
	 * 设置：物品特征
	 */
	public void setWupintezheng(String wupintezheng) {
		this.wupintezheng = wupintezheng;
	}
	/**
	 * 获取：物品特征
	 */
	public String getWupintezheng() {
		return wupintezheng;
	}
	/**
	 * 设置：物品颜色
	 */
	public void setWupinyanse(String wupinyanse) {
		this.wupinyanse = wupinyanse;
	}
	/**
	 * 获取：物品颜色
	 */
	public String getWupinyanse() {
		return wupinyanse;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：物品大小
	 */
	public void setWupindaxiao(String wupindaxiao) {
		this.wupindaxiao = wupindaxiao;
	}
	/**
	 * 获取：物品大小
	 */
	public String getWupindaxiao() {
		return wupindaxiao;
	}
	/**
	 * 设置：认领时间
	 */
	public void setRenlingshijian(Date renlingshijian) {
		this.renlingshijian = renlingshijian;
	}
	/**
	 * 获取：认领时间
	 */
	public Date getRenlingshijian() {
		return renlingshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
