package fr.afpa.zoo.animal.animalnageant;

import fr.afpa.zoo.animal.Animal;

public class AnimalQuiPeutNager extends Animal {

	public AnimalQuiPeutNager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalQuiPeutNager(String nom, String race, int poids, int age, boolean griffes, String couleur) {
		super(nom, race, poids, age, griffes, couleur);
		// TODO Auto-generated constructor stub
	}

	public void nager() {
		System.out.println("je nage");
	}

}
