package com.nrs.entites;

/**
 * @author 杨润东
 *
 * @date: 2018年6月30日 下午2:37:35
 */
public class InspectedCpy {

	private Integer id;
	private String cpy;
	private String address;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpy() {
		return cpy;
	}
	public void setCpy(String cpy) {
		this.cpy = cpy;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "InspectedCpy [id=" + id + ", cpy=" + cpy + ", address=" + address + ", phone=" + phone + "]";
	}
	
}
