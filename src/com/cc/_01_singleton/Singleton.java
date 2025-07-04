package com.cc._01_singleton;

public class Singleton {
	//Eager Instantiation
	private static Singleton instance = null;
	
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(instance==null)
		synchronized(Singleton.class) {
		instance = new Singleton();
	
		}
		return instance;
	}
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"--------->"+this.hashCode());
		
	}
	
	
}
