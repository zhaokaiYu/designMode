package com.yuzk.Factory.abstractFactory;

public interface Engine {
	void start();
}
class GoodEngine implements Engine{

	public void start() {
		System.out.println("转速快");
	}
}
class LowEngine implements Engine{

	public void start() {
		System.out.println("转速慢");
	}
}