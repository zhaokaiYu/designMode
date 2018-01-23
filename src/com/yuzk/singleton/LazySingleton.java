package com.yuzk.singleton;

import javax.management.InstanceAlreadyExistsException;

/**
 * 懒汉式单例模式
 * @author yuzhaikai
 *
 */
/**
 * 线程不安全
 */
/*public class LazySingleton{
	private LazySingleton(){}
	private static LazySingleton instance;
	public static LazySingleton getInstance(){
		if (instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}*/
/**
 * 运行慢
 * @author 28049
 *
 */
/*public class LazySingleton{
	private LazySingleton(){}
	private static LazySingleton instance;
	public synchronized static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}*/

public class LazySingleton{
	private LazySingleton(){}
	private static LazySingleton instance;
	public static LazySingleton getInstance(){
		if(instance == null){
			synchronized (LazySingleton.class) {
				if(instance == null){
					instance = new LazySingleton();
				}
			}
			
		}
		return instance;
	}
}
