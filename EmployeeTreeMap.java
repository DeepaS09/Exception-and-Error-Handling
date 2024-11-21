package Task1;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
	
		        TreeMap<Integer, String> employeeMap = new TreeMap<>();

		        
		        employeeMap.put(101, "John");
		        employeeMap.put(102, "Alice");
		        employeeMap.put(103, "Bob");
		        employeeMap.put(104, "Charlie");
		        employeeMap.put(105, "Eve");

		        System.out.println("Employee Names in Alphabetical Order:");
		        
		        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		            System.out.println(entry.getValue());
		        }
		    }
}
