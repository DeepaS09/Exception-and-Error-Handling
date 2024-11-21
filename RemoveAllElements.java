package Task1;
import java.util.ArrayList;

public class RemoveAllElements {

	public static void main(String[] args) {
		

		        ArrayList<String> stringList = new ArrayList<>();

		        
		        stringList.add("Apple");
		        stringList.add("Banana");
		        stringList.add("Cherry");
		        stringList.add("Date");
		        
		        
		        System.out.println("Original ArrayList: " + stringList);

		        
		        stringList.clear();

		        
		        System.out.println("ArrayList after removing all elements: " + stringList);
		    }

}

