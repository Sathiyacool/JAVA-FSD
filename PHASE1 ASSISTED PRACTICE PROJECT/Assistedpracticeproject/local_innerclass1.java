package Assistedpracticeproject;

public class local_innerclass1 {
	
	void test()
	{
		class inner{
			void hello() {
				System.out.println(" welcome Everyone!");
			}
		}
		inner ob=new inner();
		ob.hello();

	}

	public static void main(String[] args)
	{
		local_innerclass1 obj=new local_innerclass1();
		obj.test();
	}
}
