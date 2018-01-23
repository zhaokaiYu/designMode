package com.yuzk.Factory.abstractFactory;

public class LowCar implements CarFactory{

	public Engine createEngine() {
		return new LowEngine();
	}

	public Tyre createEnTyre() {
		// TODO Auto-generated method stub
		return new LowTyre();
	}

}
