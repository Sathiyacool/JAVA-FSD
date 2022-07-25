package Assistedpracticeproject1;

class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		this.str1=str2;
	   }
	   public String toString(){ 
		return ("My Exception Occurred: "+str1) ;
	   }
	}
	class Exception_Handling {
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("This is My error Message");
		}
		catch(MyException Ex){
			System.out.println("Catch Block") ;
			System.out.println(Ex) ;
		}
	   }
	}

