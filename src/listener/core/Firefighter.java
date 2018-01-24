package listener.core;

public class Firefighter extends Actor {
	@Override
	public void alert(Alert alert) {
		System.out.println("Alerte pompier");
	}

	@Override
	public boolean isConcerned(Alert alert) {
		return alert.getLevel() > 1;
	}
}
