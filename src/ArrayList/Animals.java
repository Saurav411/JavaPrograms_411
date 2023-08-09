package ArrayList;

import java.util.ArrayList;

public class Animals {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Bandar");
		animals.add("Bhalu");
		animals.add("Zebra");
		animals.add("Tiger");

		for (int i = 0; i < animals.size(); i++) {
			System.out.println("animals: " + animals.get(i) + "\n");
		}

		for (String animalName : animals) {
			System.out.println(animalName + "\n");
		}
	}
}
