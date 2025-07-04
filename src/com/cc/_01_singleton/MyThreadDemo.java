package com.cc._01_singleton;

public class MyThreadDemo {

	public static void main(String[] args) {
		
//	   Singleton s1= Singleton.getInstance();
//	   Singleton s2= Singleton.getInstance();
//	   Singleton s3= Singleton.getInstance();
//	   Singleton s4= Singleton.getInstance();
//	   
//	   System.out.println(s1==s2);
//	   System.out.println(s3==s4);
//	   System.out.println(s1.hashCode());
//	   System.out.println(s3.hashCode());
	   
	   MyThread t1= new MyThread();
	   MyThread t2= new MyThread();
	   MyThread t3= new MyThread();
	   t1.start();
	   t2.start();
	   t3.start();
	   
	}

}
