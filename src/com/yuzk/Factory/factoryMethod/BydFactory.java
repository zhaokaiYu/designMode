package com.yuzk.Factory.factoryMethod;

public class BydFactory implements CarFactory {

	public Car createCar() {
		
		return new Byd();
	}

}
