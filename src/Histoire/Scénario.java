package Histoire;

import personnages.Gaullois;
import personnages.Romain;
import personnages.Druide;
public class Scénario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus",6);
		Gaullois astérix = new Gaullois ("Astérix",8);
		Gaullois obélix = new Gaullois("Obélix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petit potion...");
		panoramix.preparerPotion(obélix);
		panoramix.preparerPotion(astérix);
		astérix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU... ");
		astérix.frapper(minus);
		astérix.frapper(minus);
		astérix.frapper(minus);
		

	}

}
