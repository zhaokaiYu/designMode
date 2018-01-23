package com.yuzk.bridge;

public class TTT {
	public static void main(String[] args) {
		Brand brand = new Lenove();
		Computer c = new Pad(brand);
		c.saleC();
	}
}
