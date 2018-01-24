package castaway;

import castaway.core.Client;
import castaway.core.Entrepot;
import castaway.core.Product;

public class Main {
	public static void main(String[] args) {
		Client client = new Client();

		System.out.println(client.retire(1));

		Product product = new Product(1, "pouet");

		Entrepot.get().add(product);

		System.out.println(client.retire(1));
		System.out.println(client.retire(1));
	}
}
