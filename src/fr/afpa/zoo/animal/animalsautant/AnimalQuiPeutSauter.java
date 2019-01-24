package fr.afpa.zoo.animal.animalsautant;

import fr.afpa.zoo.animal.Animal;

public class AnimalQuiPeutSauter extends Animal {// un animal qui peut sauter est un animal donc onn le relie à la class
													// mere

	public AnimalQuiPeutSauter() {
		super();

	}

	public AnimalQuiPeutSauter(String nom, String race, int poids, int age, boolean griffes, String couleur) {
		super(nom, race, poids, age, griffes, couleur);

	}

	public void sauter() {// creationd 'une class
		System.out.println("je peux sauter, et hop !");
	}

}
