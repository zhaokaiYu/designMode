package com.yuzk.bridge;

public interface Brand {
	void saleB();
}
class Lenove implements Brand{
	public void saleB() {
		System.out.println("联想");
	}
}

class XiaoMi implements Brand{
	public void saleB() {
		System.out.println("小米");
	}
}

class ShenZhou implements Brand{
	public void saleB() {
		System.out.println("神舟");
	}
}