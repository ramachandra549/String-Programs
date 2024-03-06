package com.string;

public class PracticeDemo {

	public static void main(String[] args) {
		String s="Rama Chandra Nayak anna",w="";
		s+=" ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else
			{
//				if(w.startsWith("R"))
//				{
//					System.out.println(w);
//				}
//				if(w.endsWith("a"))
//				{
//					System.out.println(w);
//				}
//				if(w.contains("a"))
//				{
//					System.out.println(w);
//				}
//				if(w.length()==5)
//				{
//					System.out.println(w);
//				}
//				char f=w.charAt(0);
//				char l=w.charAt(w.length()-1);
//				if(Character.toUpperCase(f)==Character.toUpperCase(l))
//				{
//					System.out.println(w);
//				}
				if(w.equalsIgnoreCase("Rama"))
				{
					count++;
				}
				w="";
			}
			
		}
		if(count==0)
		{
			System.out.println("Word not found");
		}
		else
		{
			System.out.println("Word is found");
		}
	}
}
