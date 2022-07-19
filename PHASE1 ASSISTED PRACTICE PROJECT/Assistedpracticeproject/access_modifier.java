package Assistedpracticeproject;

import Pattern.access_specifier;

public class access_modifier {
	public void method_public(){
		System.out.println("This is public method");
	}
	private void method_private(){
		System.out.println("This is private method");
	}
	protected void method_protected(){
		System.out.println("This is protected method");
	}
	 void method_default(){
		System.out.println("This is default method");
	}
	
	
	public static void main(String[] args) {
		access_modifier obj=new access_modifier();
		obj. method_public();
		obj. method_private();
		obj. method_protected();
		obj. method_default();
	}

}
