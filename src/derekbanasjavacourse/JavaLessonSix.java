package derekbanasjavacourse;

import java.io.*;

public class JavaLessonSix {

	public static void main(String[] args) {
		getAFile("./someStuff.txt");
	}


	public static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
			System.out.println("File found successfully!");
		} catch (FileNotFoundException e) {
			System.out.println("Error: The file was not found.");
			e.printStackTrace();
		}
	}

}
