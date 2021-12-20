public class Trumpet extends Instrument  {
	private int numberOfValves;
	
	public Trumpet( int volume, int weight, boolean readyToPlay, String color, int numberOfValves) {
		super(volume, weight, readyToPlay, color);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfValves() {
		return numberOfValves;
	}

	public void setNumberOfValves(int numberOfValves) {
		this.numberOfValves = numberOfValves;
	}
}
