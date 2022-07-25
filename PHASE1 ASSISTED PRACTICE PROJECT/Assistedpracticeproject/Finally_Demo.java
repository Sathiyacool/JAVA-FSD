package Assistedpracticeproject1;

public class Finally_Demo {
	public static void main(String[] args)
    {
        int a=45,b=0,quotient = 0;
        try
        {
            quotient = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.println("The result is : " + quotient);
        }
    }
}

