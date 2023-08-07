package fileCopy;

import java.io.*;

public class CopyFiles {
	
	public static void main(String[] args) throws IOException {

		String sourceFileName = "D:\\Self\\eclipse-workspace\\My Projects\\src\\fileCopy\\test1.txt";
		String destinationFileName = sourceFileName + "_copy.txt";
		
		FileInputStream reader = new FileInputStream(sourceFileName);
		
		FileOutputStream writer = new FileOutputStream(destinationFileName);

		int data = reader.read();

		do {
			writer.write(data);
			data = reader.read();

		} while (data != -1);
		
		writer.close();
		reader.close();

		System.out.println("File Copied Successfully");

		
	}

}
