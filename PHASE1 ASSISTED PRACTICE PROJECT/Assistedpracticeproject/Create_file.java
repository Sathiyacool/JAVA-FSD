package Assistedpracticeproject1;

import java.io.File;

public class Create_file {

	public static void main(String[] args) {
		File file=new File("newfile.txt");
		 try {
			 boolean value=file.createNewFile();
			 if(value) {
				 System.out.println("The new file is created");
			 }
			 else {
				 System.out.println("The file is already exists");
			 }
		 }
		 catch(Exception Ex) {
			 Ex.getStackTrace();
		 }
		
	}

}
