package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public int getForcePotion() {
		return forcePotion;
	}
	
	
	
	private void booster(Gaullois gaullois) {
		if (gaullois.getNom().equals("Obélix")){
			parler("Non,Obélix!... Tu n'auras pas de potion magique !");
			gaullois.parler("Par Bélénos, ce n'est pas juste !");
			
	}else {
		gaullois.boirePotion(forcePotion);
	}
		
	}
	
	
	public void preparerPotion(Gaullois gaullois) {
		Random random = new Random ();
		forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force "+ forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+ forcePotion);
		}
		booster(gaullois);
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() { 
		return "Le druide " + nom + " : ";

	}
	
	public static void main(String[] args) {
		//TODO créer un main permettant de tester la classe Druide
	}
}
