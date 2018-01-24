package next;

import next.core.Case;
import next.core.Grille;
import next.core.Iterator;

public class Main {
	public static void main(String[] args) {
		Grille grille = new Grille();

		grille.set(0, 1, "R");
		grille.set(5, 3, "J");

		Iterator iterator = grille.iterator();
		Case c = iterator.next();

		while (c != null) {
			System.out.println(c.getJeton());
			c = iterator.next();
		}
	}
}
