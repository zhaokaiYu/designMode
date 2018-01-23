package com.yuzk.Factory.factoryMethod;

public class TTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car byd = new BydFactory().createCar();
		Car bmw = new BmwFactory().createCar();
		byd.run();
		bmw.run();
	}

}
