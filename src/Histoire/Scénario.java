package Histoire;

import personnages.Gaullois;
import personnages.Romain;
import personnages.Druide;
public class Sc�nario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus",6);
		Gaullois asterix = new Gaullois ("Astérix",8);
		Gaullois obelix = new Gaullois("Obélix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petit potion...");
		panoramix.preparerPotion(obelix);
		panoramix.preparerPotion(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU... ");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}


