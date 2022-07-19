package Assistedpracticeproject;

public class innerclass {
	private String name="Hello";
	
	class inner{
		void hello() {
			System.out.println(" welcome Everyone!");
		}
	}

	public static void main(String[] args) {
     
		innerclass obj=new innerclass();
		innerclass.inner innerobj=obj.new inner();
		innerobj.hello();
     

	}

}
