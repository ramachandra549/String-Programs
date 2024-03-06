package com.string;

import java.util.Scanner;

public class CharOccur {

	public static void main(String[] args) {
		
		String s="Ramachandra Nayak";
		char c='r';
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==c)
			{
				count++;
			}
			System.out.println(ch);
		}
		System.out.println(count);
		
/*
 
 
		  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
	
		char ch=sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch2=s.charAt(i);
			if(ch2==ch)
			{
				count++;
			}
		}
		System.out.println(count);
		
 */
		
	}
}
