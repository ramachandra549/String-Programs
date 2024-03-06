package com.string;

public class CountingDigits {

	public static void main(String[] args) {
		long num=987654789;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;	
		}
		System.out.println(count);
	}
}
