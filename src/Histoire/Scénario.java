package Histoire;

import personnages.Gaullois;
import personnages.Romain;
import personnages.Druide;
public class Sc�nario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus",6);
		Gaullois ast�rix = new Gaullois ("Ast�rix",8);
		Gaullois ob�lix = new Gaullois("Ob�lix",25);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une petit potion...");
		panoramix.preparerPotion(ob�lix);
		panoramix.preparerPotion(ast�rix);
		ast�rix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU... ");
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		ast�rix.frapper(minus);
		

	}

}
