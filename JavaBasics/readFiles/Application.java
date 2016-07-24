package readFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 Exception type:
 1. Runtime (unchecked exception) (system error, divided by zero, array index out of bound)
 2. Checked Exception (force to handle, customized)
 */

public class Application {

	public static void main(String[] args) {
		String fileName = "C:\\text.txt";
		File file = new File(fileName);

		// Use FileReader to read a file
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferReader.close();
		} catch (FileNotFoundException e) {// this is a child exception of
											// IOException, so it needs to be
											// handled first
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Use FileReader to read a file + Try by resource (only works in java
		// 7)
		// try (BufferedReader bufferReader = new BufferedReader(new
		// FileReader(file))) {
		// String line;
		// while( (line = bufferReader.readLine()) != null ) {
		// System.out.println(line);
		// }
		// } catch (FileNotFoundException e) {//this is a child exception of
		// IOException, so it needs to be handled first
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// Use Scanner to read a file
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();// read lines
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Use FileWriter to write a file + Try by resource (only works in java
		// 7)
		// try (BufferedWriter bufferWriter = new BufferedWriter(new
		// FileWriter(file))) {
		// bufferWriter.write("This is a new line.");
		// bufferWriter.write("This is a new line.");
		// bufferWriter.newLine();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}

}
