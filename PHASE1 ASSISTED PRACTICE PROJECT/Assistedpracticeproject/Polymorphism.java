package Assistedpracticeproject1;

public class Polymorphism {
	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Polymorphism obj = new  Polymorphism(); 
	        System.out.println(obj.sum(5, 10)); 
	        System.out.println(obj.sum(15, 20, 25)); 
	        System.out.println(obj.sum(30.5, 40.5)); 
	    } 
	}
