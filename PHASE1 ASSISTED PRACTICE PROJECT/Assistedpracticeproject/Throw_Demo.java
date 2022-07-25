package Assistedpracticeproject1;

public class Throw_Demo 
    {
        public static void main(String[] args)
        {

            int a=45,b=0,c;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("Can't divide by zero."));
                else
                {
                    c = a / b;
                    System.out.print("\n\tThe result is : " + c);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.println("Error : " + Ex.getMessage());
            }

            System.out.println("End of program.");
        }
   
}
