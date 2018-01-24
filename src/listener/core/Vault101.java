package listener.core;

public class Vault101 extends Actor {
	@Override
	public void alert(Alert alert) {
		System.out.println("Alerte Vault101");
	}

	@Override
	public boolean isConcerned(Alert alert) {
		return alert.getLevel() > 3;
	}
}
