package Assistedpracticeproject1;

public class trycatch_finally {

	public static void main(String[] args) {
		int arr[]=new int[10];
		try {
			arr[10]=25;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index is Out Of Bounds");
			
		}
		finally {
			System.out.println("The array of size "+arr.length);
		}
	}

}
