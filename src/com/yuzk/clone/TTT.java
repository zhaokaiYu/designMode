package com.yuzk.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class TTT {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		Date date = new Date(43535345345l);
		Sheep s1 = new Sheep("duoli",date );
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();
		
		
		//Sheep s2 = (Sheep) s1.clone();
		
		System.out.println(s1.getSname());
		System.out.println(s1.getSbirthday());
		System.out.println(s2.getSname());
		System.out.println(s2.getSbirthday());
		date.setTime(123234534565l);
		System.out.println(s1.getSname());
		System.out.println(s1.getSbirthday());
		System.out.println(s2.getSname());
		System.out.println(s2.getSbirthday());
		
		
	}

}
