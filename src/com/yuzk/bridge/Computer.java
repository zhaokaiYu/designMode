package com.yuzk.bridge;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Computer {
	private Brand brand;
	public Computer(Brand brand){
		this.brand = brand;
	}
	public void saleC(){
		brand.saleB();
	}
}
class LapTop extends Computer{

	public LapTop(Brand brand) {
		super(brand);
	}
	public void saleC(){
		super.saleC();
		System.out.println("笔记本");
	}
}

class Pad extends Computer{

	public Pad(Brand brand) {
		super(brand);
	}
	public void saleC(){
		super.saleC();
		System.out.println("平板");
	}
}

class DeskTop extends Computer{

	public DeskTop(Brand brand) {
		super(brand);
	}
	public void saleC(){
		super.saleC();
		System.out.println("台式电脑");
	}
}