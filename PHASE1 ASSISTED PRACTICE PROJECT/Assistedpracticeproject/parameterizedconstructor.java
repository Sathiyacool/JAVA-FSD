package Assistedpracticeproject;

public class parameterizedconstructor {

		String student_name;
		int roll_no;
		
		parameterizedconstructor(String a,int b)
		{
			this.student_name=a;
			this.roll_no=b;
		}
		public void display() 
		{
			System.out.println(student_name+" "+roll_no);
		}


		public static void main(String[] args) 
		{
			parameterizedconstructor obj1=new parameterizedconstructor("sathiya",10);
			parameterizedconstructor obj2=new parameterizedconstructor("seelan",100);
			obj1.display();
			obj2.display();
		}
	}


