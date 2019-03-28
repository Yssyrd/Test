package com.nrs.entites;

import java.sql.Timestamp;

/**
 * @author 杨润东
 *
 * @date: 2018年6月30日 下午2:57:39
 * 
 * 用于存储被检仪器的基本信息
 * 
 * 
 */
public class InstrumentInfo {

	private Integer id;
	private String instrumentId;			//被检仪器编号
	private String instrumentName;			//被检仪器名称
	private String inspectedId;				//所属单位ID
	private String brand;					//被检仪器品牌
	private String fontSide;				//仪器前端图片地址
	private String backSide;				//仪器后端图片地址
	private String leftSide;				//仪器左端图片地址
	private String rightSide;				//仪器右端图片地址
	private Timestamp loginDate;			//注册时间
	private Timestamp logoutDate;			//注销时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFontSide() {
		return fontSide;
	}
	public void setFontSide(String fontSide) {
		this.fontSide = fontSide;
	}
	public String getBackSide() {
		return backSide;
	}
	public void setBackSide(String backSide) {
		this.backSide = backSide;
	}
	public String getLeftSide() {
		return leftSide;
	}
	public void setLeftSide(String leftSide) {
		this.leftSide = leftSide;
	}
	public String getRightSide() {
		return rightSide;
	}
	public void setRightSide(String rightSide) {
		this.rightSide = rightSide;
	}
	public Timestamp getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Timestamp loginDate) {
		this.loginDate = loginDate;
	}
	public Timestamp getLogoutDate() {
		return logoutDate;
	}
	public void setLogoutDate(Timestamp logoutDate) {
		this.logoutDate = logoutDate;
	}
	
	public String getInspectedId() {
		return inspectedId;
	}
	public void setInspectedId(String inspectedId) {
		this.inspectedId = inspectedId;
	}
	@Override
	public String toString() {
		return "InstrumentInfo [id=" + id + ", instrumentId=" + instrumentId + ", instrumentName=" + instrumentName
				+ ", inspectedId=" + inspectedId + ", brand=" + brand + ", fontSide=" + fontSide + ", backSide="
				+ backSide + ", leftSide=" + leftSide + ", rightSide=" + rightSide + ", loginDate=" + loginDate
				+ ", logoutDate=" + logoutDate + "]";
	}
	
}
