package Assistedpracticeproject;

abstract class A{
	abstract void test();
		
	}

public class anonymous_innerclass {
	

	public static void main(String[] args) {

    A a=new A()
    {
    	void test() {
    	System.out.println("welcome all!");
    }

	};
    a.test();
    
	}
}
