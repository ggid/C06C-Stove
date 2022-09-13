
public class Burner {

	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	};

	// case variables
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer = 0;
	public final static int TIME_DURATION = 2;

	public Temperature getMyTemperature() { // getter for myTemperature
		return this.myTemperature;
	}

	public Setting getMySetting() {
		return mySetting;
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
			break;
		case LOW:
			this.mySetting = Setting.MEDIUM;
			break;
		case OFF:
			this.mySetting = Setting.LOW;
			break;
		}
	}

	public void minusButton() { // lower setting one notch
		timer = TIME_DURATION; // reset the timer
		switch (this.mySetting) {
		case OFF:
			break;
		case LOW:
			this.mySetting = Setting.OFF;
			break;
		case MEDIUM:
			this.mySetting = Setting.LOW;
			break;
		case HIGH:
			this.mySetting = Setting.MEDIUM;
			break;
		}
	}

	public void updateTemperature() { // update the timer and temperature
		timer--; // decrement the timer each time updateTemperature() is called

		if (timer == 0) { // once two minutes have passed, update the temperature
			timer = TIME_DURATION; // reset the timer

			switch (this.mySetting) {
			case OFF:
				switch (this.myTemperature) {
				case COLD:
					break;
				case WARM:
					this.myTemperature = Temperature.COLD;
					break;
				case HOT:
					this.myTemperature = Temperature.WARM;
					break;
				case BLAZING:
					this.myTemperature = Temperature.HOT;
					break;
				}
				break;
			case LOW:
				switch (this.myTemperature) {
				case COLD:
					this.myTemperature = Temperature.WARM;
					break;
				case WARM:
					break;
				case HOT:
					this.myTemperature = Temperature.WARM;
					break;
				case BLAZING:
					this.myTemperature = Temperature.HOT;
					break;
				}
				break;
			case MEDIUM:
				switch (this.myTemperature) {
				case COLD:
					this.myTemperature = Temperature.WARM;
					break;
				case WARM:
					this.myTemperature = Temperature.HOT;
					break;
				case HOT:
					break;
				case BLAZING:
					this.myTemperature = Temperature.HOT;
					break;
				}
				break;
			case HIGH:
				switch (this.myTemperature) {
				case COLD:
					this.myTemperature = Temperature.WARM;
					break;
				case WARM:
					this.myTemperature = Temperature.HOT;
					break;
				case HOT:
					this.myTemperature = Temperature.BLAZING;
					break;
				case BLAZING:
					break;
				}
				break;
			}
		}

	}

	public void display() {
		

		switch (this.myTemperature) {
		case COLD:
			System.out.println("[" + this.mySetting.toString() + "].....cooool");
			break;
		case WARM:
			System.out.println("[" + this.mySetting.toString() + "].....warm");
			break;
		case HOT:
			System.out.println("[" + this.mySetting.toString() + "].....CAREFUL");
			break;
		case BLAZING:
			System.out.println("[" + this.mySetting.toString() + "].....VERY HOT! DON'T TOUCH");
			break;
		}

	}

}
