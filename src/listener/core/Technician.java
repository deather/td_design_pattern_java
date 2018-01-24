package listener.core;

public class Technician extends Actor {
	@Override
	public void alert(Alert alert) {
		System.out.println("Alerte technicien");
	}

	@Override
	public boolean isConcerned(Alert alert) {
		return true;
	}
}
