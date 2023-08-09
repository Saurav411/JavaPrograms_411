package Set;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
//      Set is not storing any duplicate values
//		HashSet is not storing the values in Order.
		
		HashSet<String> values = new HashSet<String>();
		values.add("Patna");
		values.add("Indore");
		values.add("Chennai");
		values.add("Hyderabad");
		values.add("Patna");
		
		for(String city: values) {
			System.out.println(city);
		}

	}
}
