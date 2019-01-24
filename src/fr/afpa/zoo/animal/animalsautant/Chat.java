package fr.afpa.zoo.animal.animalsautant;

public class Chat extends AnimalQuiPeutSauter {

	public Chat() {
		super();

	}

	public Chat(String nom, String race, int poids, int age, boolean griffes, String couleur) {
		super(nom, race, poids, age, griffes, couleur);

	}// la class chat ne peut pas accéder au private de la class animal, il faut donc
		// dans la class mere changer le private en protected. Ensuite on peut génerer
		// le constructeur superclass

}
