package com.yuzk.singleton;

import javax.management.InstanceAlreadyExistsException;

/**
 * ����ʽ����ģʽ
 * @author yuzhaikai
 *
 */
/**
 * �̲߳���ȫ
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
 * ������
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
