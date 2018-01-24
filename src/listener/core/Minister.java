package listener.core;

public class Minister extends Actor {
	@Override
	public void alert(Alert alert) {
		System.out.println("Alerte Ministère");
	}

	@Override
	public boolean isConcerned(Alert alert) {
		return alert.getLevel() > 2;
	}
}
