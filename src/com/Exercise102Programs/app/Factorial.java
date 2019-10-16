package com.Exercise102Programs.app;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		//Variables declaration
		
		long factorial = 1;
		int number=-1;
		
		
		//Object constrution
		
		Scanner input=new Scanner(System.in);
		
		do {
			
			System.out.println("Number to calculate factorial:");
			number=input.nextInt();
			
			if(number<=0)
			{
				System.out.println("you must input a positive value");
			}
			
			
		}while (number<0);
		
		factorial = GiveFactorial(number);
		System.out.println("\tThe factorial of "+ number+" is: "+factorial+
				" \nwhich is gotten by multiplying several times "+number);
		
		//Sirve para cuando tienes muchas variables
		System.out.println(String.format("The factorial of %d is: %d, which is gotten by multiplying several times %d", number, factorial, number));

	}
	
			public static long GiveFactorial(int n)
			{
				int factorial=1;
				
				for(int i=1;i<=n;i++)
				{
					factorial=factorial*i;
				}
				
				return factorial;
				
				
			}

}
