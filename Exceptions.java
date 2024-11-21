package Task1;

public class Exceptions {

	public static void main(String[] args) {

		        
		        
		        int[] numbers = {1, 2, 3}; 
		        try {
		            
		            System.out.println("Accessing index 5 of the array: " + numbers[5]);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: ArrayIndexOutOfBoundsException - Index is out of bounds.");
		        }

		        
		        String text = "Hello";
		        try {
		            
		            System.out.println("Accessing index 10 of the string: " + text.charAt(10));
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Error: StringIndexOutOfBoundsException - Index is out of bounds.");
		        }
	}
}
