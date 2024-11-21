package Task1;

import java.util.Scanner;


class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeValidation {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    
     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

     try {
         
         if (age < 18) {
             throw new InvalidAgeException("Error: Age must be 18 or older.");
         }
         System.out.println("You have entered a valid age: " + age);
     } catch (InvalidAgeException e) {
        
         System.out.println(e.getMessage());
     } finally {
         
         scanner.close();
     }
 }
}
