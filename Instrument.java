public class Instrument implements Owner {
		
	private int volume; // "loudness"
	private int weight;
	private boolean readyToPlay;
	private String color;
	
	
	public Instrument(int volume, int weight, boolean readyToPlay, String color) {
		setVolume(volume);
		setWeight(weight);
		setReadyToPlay(readyToPlay);
		setColor(color);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isReadyToPlay() {
		return readyToPlay;
	}

	public void setReadyToPlay(boolean readyToPlay) {
		this.readyToPlay = readyToPlay;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
