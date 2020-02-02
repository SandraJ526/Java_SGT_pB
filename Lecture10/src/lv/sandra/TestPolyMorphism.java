package lv.sandra;

import lv.sandra.polymorphism.Animal;
import lv.sandra.polymorphism.Cat;
import lv.sandra.polymorphism.Dog;

public class TestPolyMorphism {
	
	public static void main (String[] args) {
		
		Animal myAnimal = new Animal ();
		Animal myDog = new Dog ();
		Animal myCat = new Cat ();
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}

}
