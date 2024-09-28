package personnages;

public class Gaullois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaullois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void boirePotion(int forcePotion) {
			effetPotion=forcePotion;
			parler("Merci Druide, je sens que ma force est"+ effetPotion + "fois décuplée");
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() { 
		return "Le gaulois " + nom + " : ";

	}

	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
		romain.recevoirCoup(force / 3 * effetPotion);
	}

	@Override
	public String toString() {
		return "Gaullois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Gaullois
		Gaullois Astérix = new Gaullois("Astérix",8);
		System.out.println(Astérix);
		Astérix.parler(Astérix.prendreParole());;
		Romain RomaisDeCon = new Romain("Débilos",1);
		Astérix.frapper(RomaisDeCon);
	}
}
