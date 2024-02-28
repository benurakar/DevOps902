package com.nt.multiplication;

public class doCreditPayment 
{
	public String meth1(int a,int b)
	{
		System.out.println(a+b);
		return "Hi";
	}
	public static void main(String[] args) 
	{
		doCreditPayment dcp = new doCreditPayment();
		String result=dcp.meth1(10, 20);
		System.out.println(result);
	}

}
