package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert (force >= 0);
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() { 
		return "Le romain " + nom + " : ";

	}

	public void recevoirCoup(int forceCoup) {
		assert (force >= 0);
		int i=force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
			assert (i > force);

		}  else {
			parler("J'abandonne...");


		}
	}

	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Romains
		Romain Ravus = new Romain("Ravus",6);
		Ravus.parler(Ravus.prendreParole());;
		Ravus.recevoirCoup(1);
	}
}


