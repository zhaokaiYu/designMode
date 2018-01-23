package com.yuzk.proxy;

/**
 * 代理类
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
		System.out.println("唱歌之后所有事");
	}
	public void before(){
		System.out.println("唱歌之前所有事");
	}
}
