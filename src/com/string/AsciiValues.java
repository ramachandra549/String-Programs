package com.string;

public class AsciiValues {

	public static void main(String[] args) {
		String s="Ramachandra";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			System.out.println(ch+" "+(int)ch);
		}
	}
}
