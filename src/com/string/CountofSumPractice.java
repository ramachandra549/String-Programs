package com.string;

public class CountofSumPractice {

	public static void main(String[] args) {
		
		int num=832333;
		int count=0;
		while(num>0)
		{
			count=count+num%10;
			num=num/10;
			
		}
		System.out.println(count);
		
	}
}
