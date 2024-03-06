package com.string;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n=10,n2=50;
		int res=(n*(n+1))/2;
		System.out.println(res);
		
//if the given number is in Range
		int sum=0;
		for(int i=n;i<=n2;i++)
		{
			sum=sum+i; 
		}
		System.out.println(sum);
	}
}
