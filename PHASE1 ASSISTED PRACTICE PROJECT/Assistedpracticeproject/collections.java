package Assistedpracticeproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collections {
	public static void main(String[] args)
	{
		System.out.println("ArrayList");
		ArrayList<String>name=new ArrayList<String>();
		name.add("sathiya");
		name.add("seelan");
		System.out.println(name);
		
		System.out.println("LinkedList");
		LinkedList<Integer>roll_no=new LinkedList<Integer>();
		roll_no.add(15);
		roll_no.add(25);
		System.out.println(roll_no);
		
		System.out.println("Vector");
		Vector<Integer>age=new Vector<Integer>();
		age.addElement(20);
		age.addElement(25);
		System.out.println(age);
		
		System.out.println("Hashset");
		HashSet<Integer>weight=new HashSet<Integer>();
		weight.add(10);
		weight.add(20);
		weight.add(30);
		weight.add(40);
		System.out.println(weight);
		
		System.out.println("Linkedhashset");
		LinkedHashSet<Integer>height=new LinkedHashSet<Integer>();
		height.add(11);
		height.add(22);
		height.add(33);
		height.add(44);
		System.out.println(height);
		
	}

}
