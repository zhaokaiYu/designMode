package com.yuzk.clone;


import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;
/**
 * 克隆模式 （深克隆）
 * @author yuzhailai
 *
 */
public class Sheep2 implements Cloneable {
	private String sname;
	private Date sbirthday;
	
	protected Object clone() throws CloneNotSupportedException{
		this.sbirthday = (Date) sbirthday.clone();
		return super.clone();
	}
	
	public Sheep2(String sname, Date sbirthday) {
		super();
		this.sname = sname;
		this.sbirthday = sbirthday;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getSbirthday() {
		return sbirthday;
	}

	public void setSbirthday(Date sbirthday) {
		this.sbirthday = sbirthday;
	}

}
