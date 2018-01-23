package com.yuzk.Factory.abstractFactory;

public class GoodCar implements CarFactory{

	public Engine createEngine() {
		return new GoodEngine();
	}

	public Tyre createEnTyre() {
		// TODO Auto-generated method stub
		return new GoodTyre();
	}
}
