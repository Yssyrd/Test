package com.nrs.entites;

import java.sql.Timestamp;

/**
 * @author ����
 *
 * @date: 2018��6��30�� ����2:57:39
 * 
 * ���ڴ洢���������Ļ�����Ϣ
 * 
 * 
 */
public class InstrumentInfo {

	private Integer id;
	private String instrumentId;			//�����������
	private String instrumentName;			//������������
	private String inspectedId;				//������λID
	private String brand;					//��������Ʒ��
	private String fontSide;				//����ǰ��ͼƬ��ַ
	private String backSide;				//�������ͼƬ��ַ
	private String leftSide;				//�������ͼƬ��ַ
	private String rightSide;				//�����Ҷ�ͼƬ��ַ
	private Timestamp loginDate;			//ע��ʱ��
	private Timestamp logoutDate;			//ע��ʱ��
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
