package castaway.core;

import java.util.List;

public class Client {
	private String name;

	public String getName() {
		return name;
	}

	public Product retire(int id) {
		Product productToReturn = null;
		List<Product> products = Entrepot.get().getProducts();

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId() == id) {
				productToReturn = products.remove(i);
				break;
			}
		}

		return productToReturn;
	}
}
