package com.string;

public class PalindromePractice {

	public static void main(String[] args) {
		
		int num=353;
		int org=num;
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		if(org==rev)
		{
			System.out.println("its palindrome");
			
		}
		else
			System.out.println("Not a palindrome");
	}
}
