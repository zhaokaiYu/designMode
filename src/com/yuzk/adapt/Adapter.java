package com.yuzk.adapt;
/**
 * 适配器模式
 * @author 28049
 *
 */
public class Adapter extends Source implements Target{

	public void handleReq() {
		// TODO Auto-generated method stub
		System.out.println("适配器的方法");
	}
	
}
