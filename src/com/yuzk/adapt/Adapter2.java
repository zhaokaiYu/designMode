package com.yuzk.adapt;

public class Adapter2 implements Target{
	private Source source;
	public Adapter2(Source source){
		super();
		this.source = source;
	}
	public void handleReq() {
		System.out.println("�������ķ���");
		
	}
	public void request() {
		source.request();
		
	}

}
