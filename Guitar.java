public class Guitar extends Instrument {
	
	private int numberOfStrings;
	private String brandName;
	private String type;
	private int numberOfFrets;
		

	public Guitar(int volume, int weight, boolean readyToPlay, String color,
			String BrandName, int numberOfStrings, String type, int numberOfFrets) {
		super(volume, weight, readyToPlay, color);
		setNumberOfStrings(numberOfStrings);
		setBrandName(brandName);
		setType(type);
		setNumberOfFrets(numberOfFrets);

		// TODO Auto-generated constructor stub
	}

	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfFrets() {
		return numberOfFrets;
	}

	public void setNumberOfFrets(int numberOfFrets) {
		this.numberOfFrets = numberOfFrets;
	}	
}

