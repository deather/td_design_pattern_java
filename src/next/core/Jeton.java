package next.core;

public class Jeton {
	private String value;

	public Jeton(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Jeton{" +
				"value='" + value + '\'' +
				'}';
	}
}
