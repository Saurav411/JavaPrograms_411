package ArrayList;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

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

	}

}
