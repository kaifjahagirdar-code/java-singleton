package com.cc._02_singleton;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cc._01_singleton.Singleton;


public class MyThreadDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try {
		    Singleton s1 = Singleton.getInstance();		
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		    oos.writeObject(s1);
		    oos.close();
		    
		    System.out.println(s1.hashCode());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
