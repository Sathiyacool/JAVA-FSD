package Assistedpracticeproject;

import java.util.Scanner;

public class method1 
{
	public int add(int a,int b) 
	{
		int x=a+b;
		return x;
	}
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
	    a=sc.nextInt();
	    System.out.println("Enter the first number:");
	    b=sc.nextInt();
	    method1 sum=new method1();
	    int add=sum.add(a, b);
	    System.out.println("The result is:"+add);
	}
	
}
