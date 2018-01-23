package com.yuzk.Factory.putong;

public class CarFactory {
	public static Car createCar(String type){
		if("±¦Âí".equals(type)){
			return new Bmw();
		}else if("±ÈÑÇµÏ".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}
}
