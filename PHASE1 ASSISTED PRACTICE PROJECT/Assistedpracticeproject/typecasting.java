package Assistedpracticeproject;

import java.util.Scanner;

public class typecasting {
	public static void main(String[] args) {
		byte a,d;
		// implicit type casting
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=(byte) sc.nextInt();
		int b=a;
		System.out.println(b);
		
		// explicit type casting
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number:");
		int c=sc1.nextInt();
		d=(byte)c;
		System.out.println(d);	
		
	}
	
}
