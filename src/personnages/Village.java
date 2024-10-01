package personnages;

import java.util.ArrayList;

public class Village {	
	private String nom;
	private Chef chef;
	private Gaullois[] villageois;
	private int nbVillageois = 0 ;
	private int nbVillageoisMaximum = 1 ;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;	
		villageois = new Gaullois [nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaullois gaullois) {
		if (nbVillageoisMaximum > nbVillageois) {
			villageois[nbVillageois] = gaullois;
			nbVillageois ++ ;
		} else {
			System.out.println("Trop de monde dans le village");
		}
	}
	
	public Gaullois trouverHabitant(int n) {
		if (n>nbVillageois) {
			System.out.println("N'existe pas dans le village");
			return villageois[0];
			} else {
				return villageois[n];
			}
		}
	
	public void affichervillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaullois :");
		int i = 0;
		while (i < nbVillageois) {
			System.out.println("- "+ villageois[i].getNom());
			i++;
		}
	}

	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		//TODO crÃ©er un main permettant de tester la classe Gaullois
		Village village1 = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",8,village1);
		village1.setChef(abraracourcix);
		Gaullois asterix = new Gaullois("Astérix",8);
		village1.ajouterHabitant(asterix);
		//Gaullois gaullois=village1.trouverHabitant(0);
		//System.out.println(gaullois);
		Gaullois obelix = new Gaullois("Obélix",25);
		village1.ajouterHabitant(obelix);
		village1.affichervillageois();

		
	}
}
