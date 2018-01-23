package com.yuzk.Factory.abstractFactory;
/**
 * 轮胎接口
 * @author yuzhailai
 *
 */
public interface Tyre {
	void run();
}
class GoodTyre implements Tyre{

	public void run() {
		System.out.println("跑的快");
	}
	
}
class LowTyre implements Tyre{

	public void run() {
		System.out.println("跑的慢");
	}
	
}
