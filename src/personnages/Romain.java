package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert (force >= 0);
		Equipement[] equipement = new Equipement[Equipement.BOUCLIER.tostring() , Equipement.CASQUE.tostring()];
	}

	public String getNom() {
		return nom;
	}
	
	public void sEquiper() {
		switch (nbEquipement) {
		case 2 :
			print("full");
			break;
		case equipement[1] == "casque":
			print("deja equipÈ");
			break;
		default:
			equipement[nbEquipement]= "casque"
			
		
		}
	}
	
	
	
	
	

	public void parler(String texte) {
		System.out.println(prendreParole() + "¬´ " + texte + "¬ª");
	}

	private String prendreParole() { 
		return "Le romain " + nom + " : ";

	}

	public void recevoirCoup(int forceCoup) {
		assert (force >= 0);
		int i=force;
		force -= forceCoup;
		if (force > 0) {
			parler("AÔe");
			assert (i > force);

		}  else {
			parler("J'abandonne...");


		}
	}

	public static void main(String[] args) {
		//TODO cr√©er un main permettant de tester la classe Romains
		Romain Ravus = new Romain("Ravus",6);
		Ravus.parler(Ravus.prendreParole());;
		Ravus.recevoirCoup(1);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);

		
	}
}


