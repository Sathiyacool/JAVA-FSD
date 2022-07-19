package Assistedpracticeproject;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class maps {

	private static Object map;

	public static void main(String[] args) {

     HashMap<Integer,String>first_name=new HashMap<Integer,String>();
     first_name.put(1,"prasath");
     first_name.put(2,"santhosh");
     first_name.put(3,"thiru");
     first_name.put(4,"vicky");
    Set<Map.Entry<Integer,String>> entries = first_name.entrySet(); 
    System.out.println("The elements of the hashmaps are:");
    for(Map.Entry<Integer,String> data:entries) 
    {
	System.out.println(data.getKey()+" "+data.getValue());
	}
    
    LinkedHashMap<Integer,String>last_name=new LinkedHashMap<Integer,String>();
    last_name.put(5,"logesh");
    last_name.put(6,"jawahar");
    last_name.put(7,"arul");
    last_name.put(8,"antony");
   Set<Map.Entry<Integer,String>> entries1 = last_name.entrySet(); 
   System.out.println("The elements of the LinkedHashMaps are:");
   for(Map.Entry<Integer,String> data:entries1) 
   {
	System.out.println(data.getKey()+" "+data.getValue());
    
	}
   TreeMap<Integer,String>Middle_name=new TreeMap<Integer,String>();
   Middle_name.put(9,"logeshwaran");
   Middle_name.put(10,"arun");
   Middle_name.put(11,"prakash");
   Middle_name.put(12,"vijay");
  Set<Map.Entry<Integer,String>> entries2 = Middle_name.entrySet(); 
  System.out.println("The elements of the TreeMaps are:");
  for(Map.Entry<Integer,String> data:entries2) 
  {
	System.out.println(data.getKey()+" "+data.getValue());
   
	}
  Hashtable<Integer,String>name=new Hashtable<Integer,String>();
  name.put(13,"das");
  name.put(14,"deepan");
  name.put(15,"nagu");

  Set<Map.Entry<Integer,String>> entries3 = name.entrySet(); 
  System.out.println("The elements of the HashTables are:");
  for(Map.Entry<Integer,String> data:entries3) 
  {
	System.out.println(data.getKey()+" "+data.getValue());
  
	}
  
  }

}
