package com.yuzk.Factory.putong;

public class CarFactory {
	public static Car createCar(String type){
		if("����".equals(type)){
			return new Bmw();
		}else if("���ǵ�".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}
}
