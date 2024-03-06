package com.string;

import java.util.Scanner;

public class CharOccurence1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name=sc.nextLine();
		System.out.println("Enter the character you want to check if is there or not: ");
		char ch='a';	//sc.next().charAt(0);
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				count++;
			}
				
		}
		System.out.println("The Number of times repeated is: "+count);

	

	}
}
