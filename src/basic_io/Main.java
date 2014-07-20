package basic_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Path txtFile = Paths.get("./src/basic_io/xanadu.txt");
		
		System.out.print("What char you want to search: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char charToSearch = sc.next().charAt(0);
		
		System.out.println(txtFile.toAbsolutePath());
		System.out.println("Char '" + charToSearch + "' in xanadu.txt: " 
							+ countChars(txtFile, charToSearch));
	
		
	}
	
	/** Write an example that counts the number of times a particular 
	 * character, such as e, appears in a file. The character can be 
	 * specified at the command line. You can use xanadu.txt as the input file.
	 * @param path - path to txt file
	 * @param charToSearch - the char you want to search
	 * @return - return the count of that how often the char is in the txt file
	 */
	public static int countChars(Path file, char charToSearch){
		int count = 0;
		
		try(BufferedReader reader = Files.newBufferedReader(file)){
			String line;
			
			while((line = reader.readLine()) != null){
				int indexChanger = -1;
				
				while((indexChanger = 
						line.indexOf(charToSearch, indexChanger + 1)) != -1){
					count++;
				}
			}
		} catch (IOException e) {
			System.out.println("Error with opening file for reading");
		}
		
		return count;
	}
}

