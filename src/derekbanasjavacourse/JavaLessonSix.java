package derekbanasjavacourse;

import java.io.*;

public class JavaLessonSix {
	
	public static void main(String[] args) // throws IOException, FileNotFoundException
	{
		getAFile("./someStuff.txt");
	}
	

	public static void getAFile(String fileName)// throws IOException, FileNotFoundException
	{
		FileInputStream file = new FileInputStream(fileName);	
	}
		
}
