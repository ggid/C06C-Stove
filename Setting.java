import java.util.*;

public enum Setting {
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

	private String whoKnows; // instance variable
	private HashMap<String, String> temps = new HashMap<String, String>();
	private String addMe = "";

	Setting(String quien) {
		whoKnows = quien; // constructor that accepts a string

		temps.put("OFF", "coool");
		temps.put("LOW", "warm");
		temps.put("MEDIUM", "CAREFUL");
		temps.put("HIGH", "VERY HOT! DON'T TOUCH");

	}

	@Override
	public String toString() { // toString() function
		// switch(Setting) {
		// case Setting == Setting.OFF:

		// }
		return "[" + this.whoKnows + "]....." + temps.get(this.whoKnows);
	}

}

