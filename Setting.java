import java.util.*;

public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

	private String whoKnows; // instance variable
	private HashMap<String, String> temps = new HashMap<String, String>();
	private String addMe = "";

	Setting(String quien) {
		this.whoKnows = quien; // constructor that accepts a string

	}

	@Override
	public String toString() { // toString() function

		this.temps.put("OFF", "coool");
		this.temps.put("LOW", "warm");
		this.temps.put("MEDIUM", "CAREFUL");
		this.temps.put("HIGH", "VERY HOT! DON'T TOUCH");

		switch (this.whoKnows) {
		case "---":
			return "[" + this.whoKnows + "]....." + temps.get("OFF");
		case "--+":
			return "[" + this.whoKnows + "]....." + temps.get("LOW");
		case "-++":
			return "[" + this.whoKnows + "]....." + temps.get("MEDIUM");
		case "+++":
			return "[" + this.whoKnows + "]....." + temps.get("HIGH");
		}
		return ":(";
	}

}
