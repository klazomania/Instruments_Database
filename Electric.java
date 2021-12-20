public class Electric extends Guitar {
	private boolean hasWhammyBar;

	public Electric(int volume, int weight, boolean readyToPlay, String color,
			String BrandName, int numberOfStrings, String type, int numberOfFrets, boolean hasWhammyBar) {
		super( volume, weight, readyToPlay, color, BrandName, numberOfStrings, type, numberOfFrets);
		// TODO Auto-generated constructor stub
	}

	public boolean getHasWhammyBar() {
		return hasWhammyBar;
	}

	public void setHasWhammyBar(boolean hasWhammyBar) {
		this.hasWhammyBar = hasWhammyBar;
	}

}
