package com.yuzk.clone;


import java.io.Serializable;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;
/**
 * ��¡ģʽ ��ǳ��¡��
 * @author yuzhailai
 *
 */
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date sbirthday;
	
	protected Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}

	public Sheep(String sname, Date sbirthday) {
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
