package com.nrs.db;

/**
 * @author ����
 *
 * @date: 2018��7��11�� ����9:58:11
 */
public class RDataSave {

	private String rom;
	private String sum;
	private String realData;
	private String count;
	
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getRealData() {
		return realData;
	}
	public void setRealData(String realData) {
		this.realData = realData;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "RDataSave [rom=" + rom + ", sum=" + sum + ", realData=" + realData + ", count=" + count + "]";
	}
	
	
}
