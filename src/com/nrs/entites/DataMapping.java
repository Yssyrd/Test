package com.nrs.entites;

import java.sql.Timestamp;

/**
 * @author ����
 *
 * @date: 2018��6��30�� ����3:08:52
 */
public class DataMapping {

	private Integer id;						
	private String instrumentId;				//��ӦInstrumentInfo���ID
	private String aRadial;						//��ӦData����ID�����������
	private String bRadial;						//��ӦData����ID�����������
	private String rRadial;						//��ӦData����ID�����������
	private String remark;						//��ע
	private String serials;						//���к�
	private String address;						//�ص�
	private String aThreshold;					//����ֵ
	private String bThreshold;					//����ֵ
	private String rThreshold;					//����ֵ
	
	private Timestamp loginDate;				//ӳ�����ʱ��
	private Timestamp logoutDate;				//ӳ���ɾ��ʱ��
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
