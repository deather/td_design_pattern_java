package listener.core;

public class Hospital extends Actor {
	@Override
	public void alert(Alert alert) {
		System.out.println("Alerte hopital");
	}

	@Override
	public boolean isConcerned(Alert alert) {
		return alert.getLevel() > 2;
	}
}
