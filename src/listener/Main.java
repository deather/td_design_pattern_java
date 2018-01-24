package listener;

import listener.core.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Système d'alerte");

		Central central = new Central();

		central.register(new Technician());
		central.register(new Firefighter());
		central.register(new Hospital());
		central.register(new Minister());
		central.register(new Vault101());

		for (int i = 1; i < 5; i++) {
			Alert alert = new Alert(i);

			System.out.println("Alerte de niveau " + i);
			central.notifyActors(alert);
			System.out.println("--------");
		}
	}
}
