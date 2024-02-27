package com.nt.service;

import com.nt.multiplication.*;

public class App 
{
	public int method(int x, int y)
	{
		ClassA obj= new ClassA();
		int result=obj.mul(2,10);
		System.out.println(result);
		System.out.println(obj.mul(10, 20)+2);
		System.out.println(x);
		return y;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Yuvaraj");
        App obj1=new App();
        int result=obj1.method(2, 8);
        //new App().method(2, 4);
        System.out.println(result);
    }
}
