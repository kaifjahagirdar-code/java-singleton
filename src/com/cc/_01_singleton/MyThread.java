package com.cc._01_singleton;

public class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton s1= Singleton.getInstance();
		s1.showMessage();
	}


}
