package com.yuzk.singleton;
/**
 * ����ʽ����ģʽ
 * @author yuzhailai
 *
 */
public class EagerSingleton{
	private EagerSingleton(){
	}
	private static EagerSingleton instance = new EagerSingleton();
	public static EagerSingleton getEagerSingleton(){
		return instance;
	}
}
