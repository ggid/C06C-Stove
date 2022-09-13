
public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

	private String whoKnows; // instance variable

	Setting(String quien) {
		this.whoKnows = quien; // constructor that accepts a string

	}

	@Override
	public String toString() { // toString() function
		return this.whoKnows;
	}

}
