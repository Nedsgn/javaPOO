package fr.afpa.zoo.animal.animalvolant;

import fr.afpa.zoo.animal.animalsautant.AnimalQuiPeutSauter;

public class AnimalQuiPeutVoler extends AnimalQuiPeutSauter {
	protected int longueurAiles;// caract�ristiques

	/**
	 * @return the longueurAiles
	 */
	public int getLongueurAiles() {
		return longueurAiles;
	}

	/**
	 * @param longueurAiles the longueurAiles to set
	 */
	public void setLongueurAiles(int longueurAiles) {
		this.longueurAiles = longueurAiles;
	}

//////
	//////////
	//////////
	public AnimalQuiPeutVoler() {
		super();

	}

	public AnimalQuiPeutVoler(String nom, String race, int poids, int age, boolean griffes, String couleur) {
		super(nom, race, poids, age, griffes, couleur);

	}

	public void voler() {

		System.out.println("*vole dans les airs*");
	}
	// --------------------------------On maintenant dzeux specifit�s : 1 propri�t�
	// et une fonctionnalit� !

}
