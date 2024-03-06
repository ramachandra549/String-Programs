package com.string;

public class CountLower_UpperCaseChar {

	public static void main(String[] args) {
		String s="Rama Chandra Nayak";
		int lcount=0,ucount=0,scount=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			ucount++;
			else if(Character.isLowerCase(c))
				lcount++;
			else if(Character.isWhitespace(c))
				scount++;
			
			
		}
		System.out.println(lcount);
		System.out.println(ucount);
		System.out.println(scount);
	}
}
