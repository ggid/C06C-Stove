
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

	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;

	}

	public void plusButton() { // raise the setting one notch
		timer = TIME_DURATION; // reset the timer
		switch (this.mySetting) {
		case HIGH:
			break;
		case MEDIUM:
			this.mySetting = Setting.HIGH;
		case LOW:
			this.mySetting = Setting.MEDIUM;
		case OFF:
			this.mySetting = Setting.LOW;
		}
	}

	public void minusButton() { // lower setting one notch
		timer = TIME_DURATION; // reset the timer
		switch (this.mySetting) {
		case OFF:
			break;
		case LOW:
			this.mySetting = Setting.OFF;
		case MEDIUM:
			this.mySetting = Setting.LOW;
		case HIGH:
			this.mySetting = Setting.MEDIUM;
		}
	}

	public void updateTemperature() { // update the timer and temperature
		timer--;

		if (timer == 0) {
			timer = TIME_DURATION;

			switch (this.mySetting) {
			case OFF:
				break;
			case LOW:
				this.myTemperature = Temperature.WARM;
			case MEDIUM:
				this.myTemperature = Temperature.HOT;
			case HIGH:
				this.myTemperature = Temperature.BLAZING;
			}
		}

	}

	public void display() {

		System.out.println(this.mySetting.toString());

	}

}
