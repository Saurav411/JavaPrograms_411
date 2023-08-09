package Set.Animals;

import java.util.HashSet;

public class hashSetAnimals {

	public static void main(String[] args) {
//      Set is not storing any duplicate values
//		HashSet is not storing the values in Order.
//		HashSet is not recognizing if there is duplicates for a customized HashSet values, like Dog, 12 is getting in the below case  but it is not able to recognize the duplicate by default.

		HashSet<Animals> animals = new HashSet<Animals>();
		Animals animal1 = new Animals("Dog", 12);
		Animals animal2 = new Animals("Cat", 12);
		Animals animal3 = new Animals("Horse", 12);
		Animals animal4 = new Animals("Dog", 12);

		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		System.out.println(animal1.equals(animal4));
		System.out.println(animal1.hashCode());
		System.out.println(animal1.hashCode());
		
		for (Animals animalName : animals) {
			System.out.println(animalName);
		}

	}
}
