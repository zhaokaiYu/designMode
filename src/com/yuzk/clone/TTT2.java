package com.yuzk.clone;

import java.util.Date;

public class TTT2 {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(43535345345l);
		Sheep2 s1 = new Sheep2("duoli",date );
		
		Sheep2 s2 = (Sheep2) s1.clone();
		
		System.out.println(s1.getSname());
		System.out.println(s1.getSbirthday());
		date.setDate((int) 123234534565l);
		System.out.println(s2.getSname());
		System.out.println(s2.getSbirthday());
		
	}

}
