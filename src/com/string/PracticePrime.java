package com.string;

import java.util.Scanner;

public class PracticePrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check the Number");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(num+" it is a prime number");
			}
			else
				System.out.println(num+" it is not a prime number");
		}
		
	}
}
