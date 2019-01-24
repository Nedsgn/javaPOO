package fr.afpa.zoo.animal;

//
public class Animal {
	protected String nom;
	protected String race;
	protected int poids;
	protected int age;
	protected boolean griffes;
	protected String couleur;

	/**
	 * 
	 */
	public Animal() {
		super();

	}
//creation d'une methode applicables a tous les animaux: Si une caractéristque n'est pas commune à tous les naimaux, on ne la met pas !

	public void manger() {
		System.out.println("Miam miam :B");
	}

	public void boire() {
		System.out.println("Slurp slurp *bois*");
	}

	public void courrir() {
		System.out.println("On fait la course ? :D");
	}

	public void dormir() {
		System.out.println("ZzZZzZzz");
	}

	public void jouer() {
		System.out.println("On joue ?");
	}

//constructeur field
	/**
	 * @param nom
	 * @param race
	 * @param poids
	 * @param age
	 * @param griffes
	 * @param couleur
	 */
	public Animal(String nom, String race, int poids, int age, boolean griffes, String couleur) {
		super();
		this.nom = nom;
		this.race = race;
		this.poids = poids;
		this.age = age;
		this.griffes = griffes;
		this.couleur = couleur;
	}

//getteranssetter
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the griffes
	 */
	public boolean isGriffes() {
		return griffes;
	}

	/**
	 * @param griffes the griffes to set
	 */
	public void setGriffes(boolean griffes) {
		this.griffes = griffes;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
