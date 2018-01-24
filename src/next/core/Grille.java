package next.core;

public class Grille {
	Case[][] cases = new Case[6][7];

	public Grille() {
		for(int i = 0; i < this.cases.length; i++) {
			for (int j = 0; j < this.cases[i].length; j++) {
				this.cases[i][j] = new Case(i, j, null);
			}
		}
	}

	public void set(int line, int column, String value) {
		this.cases[line][column].setJeton(new Jeton(value));
	}

	public Iterator iterator() {
		return new Iterator(this);
	}
}
