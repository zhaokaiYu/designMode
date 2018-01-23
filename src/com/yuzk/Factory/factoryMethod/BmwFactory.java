package com.yuzk.Factory.factoryMethod;

public class BmwFactory implements CarFactory {

	public Car createCar() {
		
		return new Bmw();
	}

}
