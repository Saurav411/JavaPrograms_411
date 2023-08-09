package Set;

import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
//      Set is not storing any duplicate values
//		LinkedHashSet is storing the values in Order.
		
		LinkedHashSet<String> values = new LinkedHashSet<String>();
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
