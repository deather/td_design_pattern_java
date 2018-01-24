package listener.core;

public abstract class Actor {
	private int id;

	public abstract void alert(Alert alert);

	public abstract boolean isConcerned(Alert alert);

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Actor))
			return false;

		return this.id == ((Actor)o).id;
	}
}
