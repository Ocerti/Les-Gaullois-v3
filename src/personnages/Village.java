package personnages;

import java.util.ArrayList;

public class Village {	
	private String nom;
	private Chef chef;
	private ArrayList<String> villageois = new ArrayList<>();
	private int nbVillageois = 0 ;
	private int nbVillageoisMaximum = 1 ;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;	
	}
	
	public void ajouterHabitant(Gaullois gaullois) {
		if (nbVillageoisMaximum > nbVillageois) {
			villageois.add(gaullois.getNom());
			nbVillageois ++ ;
		} else {
			System.out.println("Trop de monde dans le village");
		}
	}
	
	public String trouverHabitant(int n) {
		if (n>nbVillageois) {
			System.out.println("N'existe pas dans le village");
		} else {
			int i = 0;
			while (i < n) {
				i++;
			return villageois[i];
			}
		}
	}
	
	public void nbVillageoisMaximum()
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
}
