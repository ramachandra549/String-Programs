package com.string;

public class StrongNumberPractice {

	
	public static int fact(int num)
	{int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;
		
	}
	public static void main(String[] args) {
		
		int num=14;
		int temp=num,sum=0;
		while(num>0)
		{
			int remain=num%10;
			sum=sum+fact(remain);
			num=num/10;
		}
	//	System.out.println(sum);
		if(temp==sum)
			System.out.println(temp+" it is a strong number");
		else
			System.out.println(temp+" it is not a strong number");
		
		
	}
}
