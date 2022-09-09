
public class Burner {

	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	};

	private Temperature myTemperature;
	private Setting mySetting;
	private int timer = 0;
	public final static int TIME_DURATION = 2;

	public Temperature getMyTemperature() { // getter for myTemperature
		return myTemperature;
	}

	public void plusButton() { // raise the setting one notch
		timer = TIME_DURATION; // reset the timer
		switch (mySetting) {
		case HIGH:
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
		case LOW:
			mySetting = Setting.MEDIUM;
		case OFF:
			mySetting = Setting.LOW;
		}
	}

	public void minusButton() { // lower setting one notch
		timer = TIME_DURATION; // reset the timer
		switch (mySetting) {
		case OFF:
			break;
		case LOW:
			mySetting = Setting.OFF;
		case MEDIUM:
			mySetting = Setting.LOW;
		case HIGH:
			mySetting = Setting.MEDIUM;
		}
	}
	
	public void updateTemperature() {
		
	}
	
	public void display() {
		
	}

}
