package com.yuzk.decorator;

public class TTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		//car.move();
		
		car = new FlyCar(car);
		car = new WaterCar(car);
		car = new AICar(car);
		car.move();
	}
}
