package com.yuzk.Factory.abstractFactory;

public class TTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory car = new GoodCar();
		Engine engine = car.createEngine();
		engine.start();
	}

}
