
public enum Setting {OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String whoKnows;
	
	Setting (String quien) {
		whoKnows = quien;
	}

	@Override
	public String toString() {
		return "Setting [whoKnows=" + whoKnows + "]";
	}
	
}
