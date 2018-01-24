package next.core;

public class Case {
	private int line;
	private int column;
	private Jeton jeton;

	public Case(int line, int column, Jeton jeton) {
		this.line = line;
		this.column = column;
		this.jeton = jeton;
	}

	public void setJeton(Jeton jeton) {
		this.jeton = jeton;
	}

	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

	public Jeton getJeton() {
		return jeton;
	}
}
