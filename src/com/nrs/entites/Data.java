package com.nrs.entites;

import java.sql.Timestamp;

/**
 * @author 杨润东
 *
 * @date: 2018年6月27日 下午3:30:39
 */
public class Data {
	
	private Integer id;
	private String frontSide;
	private String oppositeSide;
	private String leftSide;
	private String rightSide;
	private Timestamp inputDate;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFrontSide() {
		return frontSide;
	}
	public void setFrontSide(String frontSide) {
		this.frontSide = frontSide;
	}
	public String getOppositeSide() {
		return oppositeSide;
	}
	public void setOppositeSide(String oppositeSide) {
		this.oppositeSide = oppositeSide;
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
	public Timestamp getInputDate() {
		return inputDate;
	}
	public void setInputDate(Timestamp inputDate) {
		this.inputDate = inputDate;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", frontSide=" + frontSide + ", oppositeSide=" + oppositeSide + ", leftSide="
				+ leftSide + ", rightSide=" + rightSide + ", inputDate=" + inputDate + "]";
	}
	
	
	
}
