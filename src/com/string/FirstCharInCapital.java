package com.string;

import java.util.Scanner;

public class FirstCharInCapital 
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String convertedLower=s.toLowerCase();
		String First=s.substring(0,1).toUpperCase();
		String last=s.substring(1,convertedLower.length());
		String modify=First.concat(last);
		System.out.println(modify);
		
	}
}
