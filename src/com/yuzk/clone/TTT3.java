package com.yuzk.clone;

import java.util.Date;

public class TTT3 {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(43535345345l);
		Sheep s1 = new Sheep("duoli",date );
		
		Sheep s2 = (Sheep) s1.clone();
		
		System.out.println(s1.getSname());
		System.out.println(s1.getSbirthday());
		date.setTime(123234534565l);
		System.out.println(s2.getSname());
		System.out.println(s2.getSbirthday());
		
	}

}
