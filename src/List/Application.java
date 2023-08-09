package List;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		Vehicle TataNexon = new Vehicle("Tata", "Nexon", 12000, true);

		vehicles.add(new Vehicle("Tata", "Punch", 12000, false));
		vehicles.add(TataNexon);

		for (Vehicle Car : vehicles) {
//			System.out.println(Car.make + "\n");
//			System.out.println(Car.model + "\n");
//			System.out.println(Car.price + "\n");
//			System.out.println(Car.goodCondition + "\n");
//			System.out.println("\n\n");
			
			System.out.println(Car+ "\n");
		}
		
		
//		another way to print the list using the generic method
		printElements(vehicles);
		

	}
	/**
	 * Passing any List here to print all their elements
	 * @param someList
	 */
	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println("someList: " + someList.get(i) + "\n");
		}
	}

}
