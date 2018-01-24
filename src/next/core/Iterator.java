package next.core;

public class Iterator {
	private int currentLine = 0;
	private int currentColumn = -1;
	private Grille grille;

	public Iterator(Grille grille) {
		this.grille = grille;
	}

	public Case next() {
		if(this.currentLine == 5 && this.currentColumn == 6)
			return null;

		if (this.currentColumn == 6) {
			this.currentLine++;
			this.currentColumn = 0;
		}
		else
			this.currentColumn++;

		return grille.cases[this.currentLine][this.currentColumn];
	}
}
