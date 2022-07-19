package Assistedpracticeproject;

import java.util.Scanner;

public class method3 {
	public int add(int a,int b) 
	{
		int x=a+b;
		return x;
	}
	public int add(int a,int b,int c) 
	{
		int y=a+b+c;
		return y;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b and c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		method3 obj=new method3();
		int ans1=obj.add(a,b);
		int ans2=obj.add(a,b,c);
		System.out.println("The result is:"+ans1);
		System.out.println("The result is:"+ans2);
	}

}
