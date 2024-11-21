package Task1;
import java.util.ArrayList;
import java.util.List;


public class ListToArray {

	public static void main(String[] args) {


		        
		        List<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        list.add("Date");

		        
		        String[] array = new String[list.size()];  
		        list.toArray(array);  

		        
		        System.out.println("Converted Array:");
		        for (String item : array) {
		            System.out.println(item);
		        }
		    }
}
