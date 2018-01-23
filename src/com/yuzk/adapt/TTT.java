package com.yuzk.adapt;


public class TTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Target t = new Adapter();
//		t.request();
//		t.handleReq();
		Target t = new Adapter2(new Source());
		t.request();
		t.handleReq();
	}

}
