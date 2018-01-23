package com.yuzk.singleton;
/**
 * 饿汉式单例模式
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
