package com.nrs.entites;

import java.sql.Timestamp;

/**
 * @author 杨润东
 *
 * @date: 2018年6月30日 下午3:08:52
 */
public class DataMapping {

	private Integer id;						
	private String instrumentId;				//对应InstrumentInfo表的ID
	private String aRadial;						//对应Data表中ID，代表α射线
	private String bRadial;						//对应Data表中ID，代表β射线
	private String rRadial;						//对应Data表中ID，代表γ射线
	private String remark;						//备注
	private String serials;						//序列号
	private String address;						//地点
	private String aThreshold;					//α阈值
	private String bThreshold;					//β阈值
	private String rThreshold;					//γ阈值
	
	private Timestamp loginDate;				//映射表创建时间
	private Timestamp logoutDate;				//映射表删除时间
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
	public String getaRadial() {
		return aRadial;
	}
	public void setaRadial(String aRadial) {
		this.aRadial = aRadial;
	}
	public String getbRadial() {
		return bRadial;
	}
	public void setbRadial(String bRadial) {
		this.bRadial = bRadial;
	}
	public String getrRadial() {
		return rRadial;
	}
	public void setrRadial(String rRadial) {
		this.rRadial = rRadial;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSerials() {
		return serials;
	}
	public void setSerials(String serials) {
		this.serials = serials;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getaThreshold() {
		return aThreshold;
	}
	public void setaThreshold(String aThreshold) {
		this.aThreshold = aThreshold;
	}
	public String getbThreshold() {
		return bThreshold;
	}
	public void setbThreshold(String bThreshold) {
		this.bThreshold = bThreshold;
	}
	public String getrThreshold() {
		return rThreshold;
	}
	public void setrThreshold(String rThreshold) {
		this.rThreshold = rThreshold;
	}
	@Override
	public String toString() {
		return "DataMapping [id=" + id + ", instrumentId=" + instrumentId + ", aRadial=" + aRadial + ", bRadial="
				+ bRadial + ", rRadial=" + rRadial + ", remark=" + remark + ", serials=" + serials + ", address="
				+ address + ", aThreshold=" + aThreshold + ", bThreshold=" + bThreshold + ", rThreshold=" + rThreshold
				+ ", loginDate=" + loginDate + ", logoutDate=" + logoutDate + "]";
	}
	
	
}
