package Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {

		    public static void main(String[] args) {
		        
		        String fileName = "example.txt";  

		        
		        try {
		            
		            File file = new File(fileName);
		            
		            
		            Scanner scanner = new Scanner(file);
		            
		            
		            System.out.println("Reading file contents:");
		            while (scanner.hasNextLine()) {
		                System.out.println(scanner.nextLine());
		            }
		            
		            
		            scanner.close();
		            
		        } catch (FileNotFoundException e) {
		            
		            System.out.println("Error: File not found. Please check the file path.");
		        } catch (Exception e) {
		          
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		        }
		    }
		


	}


