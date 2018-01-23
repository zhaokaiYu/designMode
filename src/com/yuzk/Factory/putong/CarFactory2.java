package com.yuzk.Factory.putong;

public class CarFactory2 {
	public static Car createByd(){
		return new Byd();
	}
	public static Car createBmw(){
		return new Bmw();
	}
}
