package com.yuzk.Factory.putong;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = CarFactory.createCar("±¦Âí");
		Car c2 = CarFactory.createCar("±ÈÑÇµÏ");
		c1.run();
		c2.run();
		Car c3 = CarFactory2.createBmw();
		Car c4 = CarFactory2.createByd();
		c3.run();
		c4.run();
	}

}
