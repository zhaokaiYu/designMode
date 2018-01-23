package com.yuzk.proxy;

/**
 * ������
 * @author yuzhailai
 *
 */
public class Proxy implements SourceAble{
	private Source source;
	public Proxy(){
		super();
		this.source = new Source();
	}
	public void sing() {
		before();
		source.sing();
		after();
	}
	public void after(){
		System.out.println("����֮��������");
	}
	public void before(){
		System.out.println("����֮ǰ������");
	}
}
