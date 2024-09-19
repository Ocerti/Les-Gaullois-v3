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
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() { 
		return "Le gaulois " + nom + " : ";

	}
	
	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	@Override
	public String toString() {
		return "Gaullois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		//TODO cr�er un main permettant de tester la classe Gaullois
		Gaullois Ast�rix = new Gaullois("Ast�rix",8);
		System.out.println(Ast�rix);
		Ast�rix.parler(Ast�rix.prendreParole());;
		Romain RomaisDeCon = new Romain("D�bilos",1);
		Ast�rix.frapper(RomaisDeCon);
	}
}
