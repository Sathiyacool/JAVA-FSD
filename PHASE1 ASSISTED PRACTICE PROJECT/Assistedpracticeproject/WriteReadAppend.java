package Assistedpracticeproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadAppend {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Be Positive life will make us happy!!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();

		}

		String textToAppend = "\r\n HAVE A GREAT DAY!";
		String fileName = "filename.txt";

		try (FileOutputStream outputStream = new FileOutputStream(fileName, true)) {

			byte[] strToBytes = textToAppend.getBytes();
			outputStream.write(strToBytes);
			System.out.println("File append successfully");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();

		}
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();

		}

	}

}