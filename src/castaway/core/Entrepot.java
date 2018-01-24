package castaway.core;

import java.util.ArrayList;
import java.util.List;

public class Entrepot {
	private List<Product> products = new ArrayList<>();
	private static Entrepot instance;

	private Entrepot() {

	}

	public static Entrepot get() {
		if (instance == null)
			instance = new Entrepot();

		return instance;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public Product getProduct(int id) {
		Product product = null;

		for (int i = 0; i < this.products.size(); i++) {
			if (this.products.get(i).getId() == id) {
				product = this.products.get(i);
				break;
			}
		}

		return product;
	}

	public void add(Product product) {
		this.products.add(product);
	}
}
