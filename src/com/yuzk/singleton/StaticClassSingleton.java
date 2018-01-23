package com.yuzk.singleton;
public class StaticClassSingleton {
	private static class Singleton{
		private static StaticClassSingleton instance = new StaticClassSingleton();
	}
	private StaticClassSingleton(){
		
	}
	public static StaticClassSingleton getStaticClassSingleton(){
		return Singleton.instance;
	}
}
