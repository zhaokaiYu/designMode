package com.yuzk.Factory.abstractFactory;
/**
 * ��̥�ӿ�
 * @author yuzhailai
 *
 */
public interface Tyre {
	void run();
}
class GoodTyre implements Tyre{

	public void run() {
		System.out.println("�ܵĿ�");
	}
	
}
class LowTyre implements Tyre{

	public void run() {
		System.out.println("�ܵ���");
	}
	
}
