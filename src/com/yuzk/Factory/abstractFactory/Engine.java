package com.yuzk.Factory.abstractFactory;

public interface Engine {
	void start();
}
class GoodEngine implements Engine{

	public void start() {
		System.out.println("ת�ٿ�");
	}
}
class LowEngine implements Engine{

	public void start() {
		System.out.println("ת����");
	}
}