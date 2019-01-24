package fr.afpa.zoo;

import fr.afpa.zoo.animal.Elephant;
import fr.afpa.zoo.animal.animalnageant.Dauphin;
import fr.afpa.zoo.animal.animalsautant.Chat;
import fr.afpa.zoo.animal.animalsautant.Chien;
import fr.afpa.zoo.animal.animalvolant.Aigle;

public class Main {

	public static void main(String[] args) {
		Chien rex = new Chien("Rex", "Berger", 20, 12, true, "chatain");

		System.out.println(rex.getRace());

		Chat tom = new Chat("Tom", "siamois", 10, 5, true, "blanc");

		System.out.println("--------------");

		System.out.println("Nom du chat : " + tom.getNom());

		tom.manger();// cette methode speut etre appliquée à tous les animaux car on la pas créer que
						// dans la class chat
		System.out.println("--------------");

		System.out.println("Chien Rex:");
		rex.courrir();
		rex.sauter();

		Elephant poppy = new Elephant("Poppy", "Afrique", 350, 40, false, "gris");

		System.out.println("--------------");

		System.out.println("Elephant : " + poppy.getNom() + " :");
		poppy.courrir();
		// un elephant ne peut fair ces actions. on peut donc pas mettre ici toutes les
		// fonctionnalités dans la class principale
		// poppy.sauter();
		// poppy.voler();

		Aigle faucon = new Aigle("Tid le faucon", "faucon", 5, 3, true, "marron");

		System.out.println("--------------");
		System.out.println(faucon.getNom() + " :");
		faucon.sauter();
		faucon.voler();

		Dauphin flipper = new Dauphin("Flipper", "crustacé", 200, 6, false, "gris clair");
		System.out.println("--------------");
		System.out.println(flipper.getNom() + " :");
		flipper.manger();
		flipper.nager();

	}

}
