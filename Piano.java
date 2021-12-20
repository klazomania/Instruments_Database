public class Piano extends Instrument {
	private int numberOfKeys;

	public Piano(int volume, int weight, boolean readyToPlay, String color, int numberOfKeys) {
		super(volume, weight, readyToPlay, color);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfKeys() {
		return numberOfKeys;
	}

	public void setNumberOfKeys(int numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}
}
